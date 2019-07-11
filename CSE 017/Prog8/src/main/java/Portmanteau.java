import java.util.*;

public class Portmanteau {
    ArrayList<String> list = new ArrayList<String>();

    public Portmanteau(ArrayList<String> a) {
        list = a;
        splitHelper(list);
    }

    public void splitHelper(ArrayList<String> list) {
        ArrayList<String> keys = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            keys.add(list.get(i));
        }

        TreeMap<String, ArrayList<String>> set = new TreeMap<>();
        ArrayList<String> value = new ArrayList<String>();
        int count = 0;
        while (count < 200) {
            int index = (int) (Math.random() * keys.size()) + 0;
            String word = keys.get(index);
            String letter;

            for (int i = 1; i < word.length(); i++) {
                letter = word.substring(0, i);
                value.add(letter);
            }
            set.put(word, value);
            count++;
        }

        String match = set.values().toArray()[0].toString().replaceAll(",", "");
        String newMatch = match.replace("[", "");
        String finalMatch = newMatch.replace("]", "");
        String array1[] = finalMatch.split("\\s+");

        ArrayList<String> p = new ArrayList<String>();
        ArrayList<String> s = new ArrayList<String>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < keys.size(); j++) {
                int index = 0;
                if (keys.get(j).startsWith(array1[i]) && !array1[i].startsWith(array1[index])) {
                    p.add(keys.get(j));
                    index++;
                } else if (keys.get(j).endsWith(array1[i]) && !array1[i].endsWith(array1[index])) {
                    s.add(keys.get(j));
                    index++;
                }

            }
        }

        Collections.sort(p);
        Collections.sort(s);
        String word;
        for (int i = 0; i < set.size(); i++) {
            String key = set.keySet().toArray()[i].toString();
            String[] array2 = key.split("\\s+");
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] != null) {
                    word = array2[j];
                    for (int k = 0; k < p.size() && k < s.size(); k++) {
                        if (word.startsWith(p.get(k).substring(0, 1)) && word.endsWith(s.get(k).substring(0, 1))) {
                            System.out.print(word + " = " + p.get(k) + " + " + s.get(k) + "\n");
                            k = k + 20;
                        } else {
                            continue;
                        }
                    }
                }
            }

        }
    }
}