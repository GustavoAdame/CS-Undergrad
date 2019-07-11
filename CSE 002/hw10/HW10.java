
/* Name: Gustavo Adame Delarosa
 * Course: CSE 002
 * Professor Carr
 * Date: 12/3/18
 * About: This homework gives you practice with multidimensional arrays 
 */
//===================================================================================
//Section: Import java libraries and start of program class "HW10"
import java.util.*;

public class HW10 {
    // ===================================================================================
    // Section: Main method, populate char[][] board with element location from 1-9
    // call all necessary methods, and while loop to end game after 9 turns or call
    // a method for a winner
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        board[0][0] = '1';
        board[0][1] = '2';
        board[0][2] = '3';
        board[1][0] = '4';
        board[1][1] = '5';
        board[1][2] = '6';
        board[2][0] = '7';
        board[2][1] = '8';
        board[2][2] = '9';

        System.out.println("TIC-TAC-TOE GAME By GUSTAVO");
        System.out.println("Player 1 is \"O\" and Player 2 is \"X\"");
        printBoard(board);
        int counter = 0;

        int count = 0;
        while (count < 9) {
            if (count % 2 == 0) {
                counter = player1Move(board);

            } else if (count % 2 == 1) {
                counter = player2Move(board);

            }
            count++;
            if (counter == 0) {
                count--;
            }
            int draw = endGame(board, count);
            if (draw >= 0 && draw <= 7) {
                count = 10;
            }
            if (count == 9) {
                System.out.println("There is a Draw!");

            }

        }
        System.out.println("Game Over. Thanks for Playing!");
    }

    // ===================================================================================
    // Section: char[][] printBoard method, takes in char[][] array as input to
    // represent current board.
    // The nested for-loop goes through char[][] returnBoard and prints out the
    // array while returning it
    public static char[][] printBoard(char[][] returnBoard) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(returnBoard[i][j] + " ");
            }
            System.out.println();
        }
        return returnBoard;
    }

    // ===================================================================================
    // Section: int player1Move method, takes in char[][] array as input to
    // represent current board.
    // Things used to check userinput position vaildity: Scanner, while loop,
    // boolean, if-else
    // Things used to check if position is already taken: nested for-loop, counter
    // If every case is passed, then userinput position is changed to an "O" for
    // player 1
    public static int player1Move(char[][] currentBoard) {
        Scanner position = new Scanner(System.in);
        System.out.println("Player 1, Please Enter A Position You Want To Place Your Mark:");
        char pos = position.next().charAt(0);
        boolean loop = true;
        while (loop) {
            if (pos <= '8' && pos > '1' || pos == '1' || pos == '9') {
                pos = pos;
                loop = false;
            } else if (pos > '8' && pos < '1' || pos != '1' || pos != '9') {
                System.out.println("Please input an 1-9 integer only");
                pos = position.next().charAt(0);
            } else {
                System.out.println("Please input an integer only");
                pos = position.next().charAt(0);
            }
        }
        int counter = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (pos == currentBoard[i][j]) {
                    currentBoard[i][j] = 'O';
                    counter = 1;
                }
            }

        }
        printBoard(currentBoard);
        if (counter == 0) {
            System.out.println("Sorry, Position Is Taken. Try Again");
        }

        return counter;
    }

    // ===================================================================================
    // Section: int player2Move method, takes in char[][] array as input to
    // represent current board.
    // Things used to check userinput position vaildity: Scanner, while loop,
    // boolean, if-else
    // Things used to check if position is already taken: nested for-loop, counter
    // If every case is passed, then userinput position is changed to an "X" for
    // player 2
    public static int player2Move(char[][] currentBoard) {
        Scanner position = new Scanner(System.in);
        System.out.println("Player 2, Please Enter A Position You Want To Place Your Mark:");
        char pos = position.next().charAt(0);
        boolean loop = true;
        while (loop) {
            if (pos <= '8' && pos > '1' || pos == '1' || pos == '9') {
                pos = pos;
                loop = false;
            } else if (pos > '8' && pos < '1' || pos != '1' || pos != '9') {
                System.out.println("Please input an 1-9 integer only");
                pos = position.next().charAt(0);
            } else {
                System.out.println("Please input an integer only");
                pos = position.next().charAt(0);
            }
        }
        int counter = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (pos == currentBoard[i][j]) {
                    currentBoard[i][j] = 'X';
                    counter = 1;
                }
            }

        }
        printBoard(currentBoard);
        if (counter == 0) {
            System.out.println("Sorry, Position Is Taken. Try Again");
        }

        return counter;
    }

    // ===================================================================================
    // Section: int endGame method, takes in char[][] array and int count as input
    // to represent current board and number of moves currently.
    // Things used to check winner (7 possible cases):
    // 1) nested for-loop to go through each column and row in array,
    // 2) created new char [] array to store winning move,
    // 3) if each element in that check array is equal to each other, then counter
    // is modify to equal type of win
    // 4) all the element in that check array are replace with dummy values for the
    // next player move
    // Things used to check what player has won:
    // 1) current number of move % 2,
    // 2) if it is equal to 0 then its player 2
    // 3) if it is equal to 1 then its player 1
    public static int endGame(char[][] currentBoard, int numMove) {
        String player = "null";
        int counter = 20;
        char[] checkPlay = new char[3];
        for (int row = 0; row < 3; ++row) {
            for (int column = 0; column < 3; ++column) {
                checkPlay[column] = currentBoard[row][column];
                if (checkPlay[0] == checkPlay[1] && checkPlay[0] == checkPlay[2]) {
                    counter = row;
                }
            }
            checkPlay[0] = 'W';
            checkPlay[1] = 'W';
            checkPlay[2] = 'W';
        }

        for (int b = 0; b < 3; ++b) {
            for (int a = 0; a < 3; ++a) {
                checkPlay[a] = currentBoard[a][b];
                if (checkPlay[0] == checkPlay[1] && checkPlay[0] == checkPlay[2]) {
                    counter = 3 + b;
                }
            }
            checkPlay[0] = 'W';
            checkPlay[1] = 'W';
            checkPlay[2] = 'W';
        }

        if (currentBoard[0][0] == currentBoard[1][1] && currentBoard[0][0] == currentBoard[2][2]) {
            counter = 6;
        }
        if (currentBoard[0][2] == currentBoard[1][1] && currentBoard[0][2] == currentBoard[2][0]) {
            counter = 7;
        }
        if (numMove % 2 == 0) {
            player = "Player 2";
        }
        if (numMove % 2 == 1) {
            player = "Player 1";
        }

        switch (counter) {
        case 0:
            System.out.println(player + " has won!");
            break;
        case 1:
            System.out.println(player + " has won!");
            break;
        case 2:
            System.out.println(player + " has won!");
            break;
        case 3:
            System.out.println(player + " has won!");
            break;
        case 4:
            System.out.println(player + " has won!");
            break;
        case 5:
            System.out.println(player + " has won!");
            break;
        case 6:
            System.out.println(player + " has won! ");
            break;
        case 7:
            System.out.println(player + " has won!");
            break;
        }
        return counter;

    }
    // ===================================================================================
    // Section: End of program class
}
