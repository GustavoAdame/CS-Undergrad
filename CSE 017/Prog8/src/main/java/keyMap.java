import java.io.*;
import java.util.*;

public class keyMap {
    ArrayList<String> wordList = new ArrayList<String>();
    String[] textData;

    public keyMap(String wordlistFile) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(wordlistFile));
            textData = null;
            String currentString = null;
            try {
                while ((currentString = fileReader.readLine()) != null) {
                    textData = currentString.split("\\s+");
                    for (int i = 0; i < textData.length; i++) {
                        wordList.add(textData[i].toLowerCase());
                    }
                }
            } finally {
                fileReader.close();
            }
        } catch (Exception e) {
            System.err.println("Error! " + e.getMessage());
        }
    }

    public void printList(List<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public ArrayList<String> getList() {
        return wordList;
    }

}