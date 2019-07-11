/*
 * CSE 17 
 * Gustavo Adame Delarosa 
 * gua222 
 * Program Description: Prog7 is a converter that will read in an infix expression 
 * and create a binary tree that represents this expression. 
 * The program will then write the expression out in several different forms.
 * Program #7
 */
public class Prog7 {
    public static void main(String[] args) {
        InFixToBinaryTreeConverter fp = new InFixToBinaryTreeConverter();
        fp.run("( 16 + 2 ) * 5 - 28 / 4");
    }
}
