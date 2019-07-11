/*
 * CSE 017 
 * Gustavo Adame Delarosa
 * gua222 
 * Program Description: Program that implements a data structure and tests that data structure with a test program
 * Program #6
 */

public class Prog6 {
    public static void main(String[] args) {
        Bashtable<Integer> t = new Bashtable<>();
        t.put("LEHIGH", 1);
        t.put("LEMON", 2);
        t.put("LE-M", 3);

        System.out.println(t.get("LEHIGH"));
        System.out.println(t.get("LEMON"));
        System.out.println(t.get("LE-M"));
        System.out.println(t.get("Black Holes"));

    }
}
