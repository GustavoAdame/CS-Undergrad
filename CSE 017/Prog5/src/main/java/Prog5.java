package main.java;

import java.util.*;

/**
 * CSE 17 Gustavo Adame Delarosa gua222 Program Description: Prog5 is a tool for
 * helping to write poetry. It allows the user to enter two words (the root word
 * and the rhyme word) and a number (degree). The program will then find all the
 * synonyms of the first word (root) that rhyme with the second word (rhyme)
 * with degree syllables matching (degree). Program #5
 */
public class Prog5 {
    public static void main(String[] args) {
        Thesaurus obj1 = new Thesaurus("mthesaurEDIT.txt");
        PronouncingDictionary obj2 = new PronouncingDictionary("cmudictEDIT.0.7a.txt", "cmudict.0.7a.phones.txt");
        try {
            if (args.length < 3) {
                System.exit(0);
            } else {
                ArrayList<String> a = new ArrayList<>(
                        obj2.findRhymingSynonyms(args[0], args[1], Integer.parseInt(args[2])));

                String list = Arrays.toString(a.toArray()).replace("[", "").replace("]", "");
                System.out.println("The synonyms for \"" + args[0] + "\" that rhymes with \"" + args[1]
                        + "\" of degree \"" + args[2] + "\" are " + list);
            }
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.exit(0);
        }
    }
}
