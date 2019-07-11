/* Name: Gustavo Adame Delarosa
 * Course: CSE 002
 * Professor Carr
 * Date: Nov 24 2018
 * Objectives: This homework gives you practice with arrays and in searching single dimensional arrays
 */
//================================================================================================
//Section: imports java libraries, start of class RemoveElements
import java.util.*;

public class RemoveElements {
//================================================================================================
//Section: Main method, calling all necessay methods, STDOUT prompts, statements, and list
//Initialize Scanner scan to take userinput, set up if-else statement when a condition isn't met  	
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		int newArray1[];
		int newArray2[];
		int index, target;
		String answer = "";
		do {
			System.out.print("Random input 10 ints [0-9] ");
			num = randomInput();

			System.out.print("\nEnter the index ");
			index = scan.nextInt();
			if (index < 0 || index > 10) {
				System.out.println("The index is not valid");
				String out = "The output array is " + listArray(num);
				System.out.println(out);
			} else {
				newArray1 = delete(num, index);
				String out1 = "The output array is ";
				out1 += listArray(newArray1);
				System.out.println(out1);
			}

			System.out.print("Enter the target value ");
			target = scan.nextInt();
			newArray2 = remove(num, target);
			String out2 = "\nThe output array is ";
			out2 += listArray(newArray2);
			System.out.println(out2);

			System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
			answer = scan.next();
		} while (answer.equals("Y") || answer.equals("y"));
	}
//================================================================================================
//Section: String listArray method, structures any array list 	
	public static String listArray(int num[]) {
		String out = "";
		for (int i = 0; i < num.length; ++i) {
			if (i > 0) {
				out += " ";
			}
			out += num[i];
		}
		out += "";
		return out;
	}
//================================================================================================
//Section: int array randomInput method, populates an array with random integers from 0-10
	public static int[] randomInput() {
		int[] random = new int[10];
		for (int i = 0; i < 10; ++i) {
			int randomValue = (int) ((Math.random()) * 10);
			random[i] = randomValue;
			System.out.print(random[i] + " ");
		}
		return random;
	}
//================================================================================================
//Section: int array delete method, "deletes" the list[index] from list.length by 
//checking to see if an index (i) = pos, if its true, then, two conditons are executed 
//1) all the indexs in new array before pos are kept the same in new array 
//2) at the index in new array where pos was found and after until the last index, 
//   are replaced with same index in list array + 1 in order to shift to the next index  	
	public static int[] delete(int[] list, int pos) {
		int[] returnList = new int[list.length - 1];
		for (int i = 0; i < list.length; i++) {
			if (i == pos) {
				for (int index = 0; index < i; ++index) {
					returnList[index] = list[index];

				}
				for (int newIndex = i; newIndex < list.length - 1; newIndex++) {
					returnList[newIndex] = list[newIndex + 1];
				}

			}
		}
		System.out.println("Index " + pos + " element is removed");
		return returnList;
	}
//================================================================================================
//Section: int array remove method, removes the target element from list array by 
//counting the number of times target was found in the array and subtacting from list.length 
//to set the new array size to avoid expection out of bound. 
//Then it checks for each element in list array to add to new array when is not equal to target 
//After all that is complete, the new array is returned
//However, if target is >= 10, then a there a statment and prints out original list
	public static int[] remove(int[] list, int target) {
		int countTarget = 0;
		if (target >= 10) {
			System.out.print("Element " + target + " was not found");
			return list;
		}
		for (int i = 0; i < list.length; ++i) {
			if (list[i] == target) {
				countTarget++;
			}
		}
		int[] returnList = new int[list.length - countTarget];
		int listIndex = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != target) {
				returnList[listIndex] = list[i];
				listIndex++;

			}

		}
		System.out.print("Element " + target + " has been found");
		return returnList;
	}
//================================================================================================
}
/*
Resources Used: 
https://stackoverflow.com/questions/4870188/delete-item-from-array-and-shrink-array
https://netjs.blogspot.com/2017/07/how-to-remove-elements-from-array-java.html
*/
		
		
	

