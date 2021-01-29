/**TestBubbleSort
 * Purpose: Organizes 10 random numbers and alphabets in order
 * Author: Stephen Holik
 * Modified by: Ashley Kim
 * Modified on: October 5, 2020
 * Course: ICS4U1
 */

package bubblesortgenerics;

public class TestBubbleSort {

	public static void main(String[] args) {

		// Sets the size of the integer array
		int size = 10;
		Integer numbers[] = new Integer[size];

		// Calls the following method and sets the random integers to the array
		BubbleSortG.randomArray(numbers);

		// Displays the array of unsorted random integers
		System.out.println("Unsorted numbers");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");

		// Creates instance of BubbleSortG, and is set for <Integer> type
		BubbleSortG<Integer> intSort = new BubbleSortG<Integer>();
		// Calls the method bubbleSortG, and passes the unsorted array 'numbers'
		intSort.bubbleSortG(numbers);

		// Displays the array of sorted integers
		System.out.println("Sorted numebers");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");

		// Sets the size of string array (size = 10)
		String[] characters = new String[size];

		// Calls the following method and sets random characters to the array
		BubbleSortG.randomArrayString(characters);

		// Displays the array of unsorted random characters
		System.out.println("Unsorted alphabets");
		for (int i = 0; i < characters.length; i++) {
			System.out.print(characters[i] + " ");
		}
		System.out.println("\n");

		// Creates an instance of BubbleSOrtG that is set for <String> type
		BubbleSortG<String> strSort = new BubbleSortG<String>();
		// Calls bubbleSortG method and passes the unsorted array 'characters'
		strSort.bubbleSortG(characters);

		// Displays the array of sorted characters
		System.out.println("Sorted alphabets");
		for (int i = 0; i < characters.length; i++) {
			System.out.print(characters[i] + " ");
		}
		System.out.println("\n");
	}

}
