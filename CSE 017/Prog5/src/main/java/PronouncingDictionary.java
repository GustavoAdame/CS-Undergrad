package main.java;

import java.io.*;
import java.util.*;

public class PronouncingDictionary {
    private Map<String, List<String>> wordList = new HashMap<String, List<String>>();
    private Map<String, Boolean> isVowel = new HashMap<String, Boolean>();

    public PronouncingDictionary(String wordlistFile, String phonemeFile) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(wordlistFile));
            String[] textData = null;
            String currentString = null;

            BufferedReader fileReader1 = new BufferedReader(new FileReader(phonemeFile));
            String[] textData1 = null;
            String currentString1 = null;

            try {
                while ((currentString = fileReader.readLine()) != null) {
                    List<String> phonemeList = new ArrayList<>();
                    if (currentString.contains(";;;")) {
                        continue;
                    }
                    textData = currentString.replaceAll("[0-9]", "").split("\\s+");

                    for (int i = 0; i < textData.length; ++i) {
                        phonemeList.add(textData[i]);
                    }
                    wordList.put(textData[0], phonemeList);
                }

                while ((currentString1 = fileReader1.readLine()) != null) {
                    textData1 = currentString1.trim().split("\\s+");
                    if (textData1[1].equals("Vowel")) {
                        isVowel.put(textData1[0], true);
                    } else {
                        isVowel.put(textData1[0], false);
                    }
                }
            } finally {
                fileReader.close();
                fileReader1.close();
            }
        } catch (Exception e) {
            System.err.println("Error!" + e.getMessage());
        }
    }

    public int rhymePhoneCount(String word1, String word2) {
        List<String> word1List = wordList.get(word1.toUpperCase());
        List<String> word2List = wordList.get(word2.toUpperCase());
        int count = 0;

        if (word1List != null && word2List != null) {
            if (word1List.size() > word2List.size()) {
                for (int i = word2List.size() - 1; i >= 0; i--) {
                    if (word2List.get(i).equals(word1List.get(i))) {
                        if (isVowel.get(word2List.get(i)).equals(isVowel.get(word1List.get(i)))) {
                            count++;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            } else if (word2List.size() > word1List.size()) {
                for (int i = word1List.size() - 1; i >= 0; i--) {
                    if (word1List.get(i).equals((word2List.get(i)))) {
                        if (isVowel.get(word1List.get(i)).equals(isVowel.get(word2List.get(i)))) {
                            count++;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            count = 0;
        }
        return count;
    }

    public List<String> findRhymingSynonyms(String rootWord, String rhymeWord, int degree) throws ThesaurusException {
        List<String> matchStrings = new ArrayList<String>();
        List<String> synonyms = new Thesaurus("mthesaurEDIT.txt").getSynonyms(rootWord);
        try {

            for (int i = 0; i < synonyms.size(); i++) {
                if (synonyms.get(i).matches("^[a-zA-Z]*$")) {
                    if (rhymePhoneCount(synonyms.get(i), rhymeWord) >= degree) {
                        matchStrings.add(synonyms.get(i));
                    }
                }
            }

        } catch (Exception e) {
            System.err.println("Catched Exception " + e.getMessage());
        }
        return matchStrings;
    }
}
