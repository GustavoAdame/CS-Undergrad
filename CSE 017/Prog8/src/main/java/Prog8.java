
/*
Gustavo Adame Delarosa
gua222
CSE 017
Program Description: A program for finding portmanteau words.
Prog #8
*/

import java.io.*;
import java.util.*;

public class Prog8 {
    public static void main(String[] args) {
        keyMap obj1 = new keyMap("1-1000.txt");
        // System.out.println(obj1.getList());
        Portmanteau obj2 = new Portmanteau(obj1.getList());

    }
}