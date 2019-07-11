import java.util.Arrays;
public class InsertionSortLab10 {
	public static void main(String[] args) {
		int[] myArrayBest = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] myArrayWorst = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int iterBest = insertionSort(myArrayBest);
		int iterWorst = insertionSort(myArrayWorst);
		System.out.println("The total number of operations performed on the sorted array: " + iterBest);
		System.out.println("The total number of operations performed on the reverse sorted array: " + iterWorst);
	}
	/** The method for sorting the numbers */
	public static int insertionSort(int[] list) {
		// Prints the initial array (you must insert another
		// print out statement later in the code)
		System.out.println(Arrays.toString(list));
		//Initialize counter for iterations
		int iterations = 0;
		//For element list[i] in the array.....
		for (int i = 1; i < list.length; i++) {
			// Update the iterations counter
			iterations++;
			// Insert list[i] into a sorted sublist list[0..i-1] 
			// so that list[0..i] is sorted. 
			for(int j = i ; j > 0 ; j--){
				if(list[j] < list[j-1]){
					// COMPLETE CODE HERE
					// (Hint: Swap the element at index j
					// with that in index j-1, making sure 
                    // to update your iterations counter)
                    list[j-1] = list[j]; 
                //    j--; 
                    iterations++;
				}
				else {
					// COMPLETE CODE HERE
					// (Hint: If the element at index j-1
					// is less than the element at index 
					// j, we’re done comparing...how 
// could we exit the for loop...?)
                        break;
				}				
			}
			System.out.println(Arrays.toString(list));
		}
		return iterations;
	}
}
