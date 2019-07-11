import java.util.Arrays;
public class SelectionSortLab10 {
	public static void main(String[] args) {
		int[] myArrayBest = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] myArrayWorst = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int iterBest = selectionSort(myArrayBest);
		int iterWorst = selectionSort(myArrayWorst);
		System.out.println("The total number of operations performed on the sorted array: " + iterBest);
		System.out.println("The total number of operations performed on the reverse sorted array: " + iterWorst);
	}

	/** The method for sorting the numbers */
	public static int selectionSort(int[] list) { 
		// Prints the initial array (you must insert another
		// print out statement later in the code to show the 
       // array as it’s being sorted)
		System.out.println(Arrays.toString(list));
		// Initialize counter for iterations
		int iterations = 0;

		for (int i = 0; i < list.length - 1; i++) {
			// Update the iterations counter
			iterations++;
			
			// Step One: Find the minimum in the list[i..list.length-1]
			int currentMin = list[i]; 
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) { 
				// COMPLETE THIS FOR LOOP
				// (In this step, make sure you update the iteration 
				// counter time you compare the current min to another 
                // element in the array.)
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
                iterations++;
			}

			// Step Two: Swap list[i] with the minimum you found above
			if (currentMinIndex != i) { 
                // COMPLETE THE CODE TO MAKE THE SWAP 
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                System.out.println(Arrays.toString(list));
			}
		}
		return iterations;
	}
}
