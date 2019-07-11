package main.java;

import java.io.*;
import java.util.*;

public class Thesaurus {
    private Map<String, List<String>> synonyms = new HashMap<String, List<String>>();

    public Thesaurus(String fileName) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String[] textData = null;
            String currentString = null;
            try {
                while ((currentString = fileReader.readLine()) != null) {
                    List<String> synonymList = new ArrayList<>();
                    textData = currentString.trim().split(",");

                    for (int i = 0; i < textData.length - 1; ++i) {
                        synonymList.add(textData[i]);
                    }
                    synonyms.put(textData[0], synonymList);
                }

            } finally {
                fileReader.close();
            }
        } catch (Exception e) {
            System.err.println("Error1!" + e.getMessage());
        }
    }

    public List<String> getSynonyms(String lookupWord) throws ThesaurusException {
        List<String> result = new ArrayList<String>();
        try {
            if (synonyms.containsKey(lookupWord)) {
                result = synonyms.get(lookupWord);
            } else {
                throw new ThesaurusException("Invaild Input!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}