/**AshleyBubbleSortG
 * Purpose: Methods that generate 10 random numbers and
 * alphabets in the array
 * Author: Stephen Holik
 * Modified by: Ashley Kim
 * Modified on: October 5, 2020
 * Course: ICS4U1
 */

package bubblesortgenerics;

public class BubbleSortG<E> {

	// This method sorts the numbers in the array from smallest to biggest
	public <E extends Comparable<E>> void bubbleSortG(E[] tempArray) {

		int size = tempArray.length;

		for (int pass = 0; pass < size - 1; pass++) {
			
			for (int i = pass + 1; i < size; i++) {
				/* Compares the two elements of the array
				 * If first element < second element => returns less than 0
				 * If first element = second element => returns 0
				 * If first element > second element => returns value greater than 0
				 */
				if (tempArray[pass].compareTo(tempArray[i]) > 0) {
					swap(tempArray, pass, i);
				}
			}
		}
	}
	// This method swaps the two elements in the array.
	public <E extends Comparable<E>> void swap(E[] tempArray2, int first, int second) {

		/* Holds the number at first index while second is assigned to first.
		 * Since we do not know the type of array, E is used instead of int
		 * or String.
		 */
		E hold = tempArray2[first];
		tempArray2[first] = tempArray2[second];
		// Assigns the number at first index to second
		tempArray2[second] = hold;
	}

	// this method fills the array with random numbers from 1 to 100
	public static void randomArray(Integer tempArray[]) {

		// determine length of array to fill
		int count = tempArray.length;

		// loop through the array to fill it (numbers from 1 to 100)
		for (int i = 0; i < count; i++) {
			tempArray[i] = (int) (Math.random() * 100) + 1;
		}
	}

	// fill an array with random capital letters
	public static void randomArrayString(String tempArray[]) {

		// determine length of array to fill
		int count = tempArray.length;
		int letter;

		// loop through the array to fill it
		for (int i = 0; i < count; i++) {
			// choose a random number between 65 and 90 (ASCII number)
			letter = (int) (Math.random() * 26) + 65;
			// convert ASCII number to a letter and put in array
			tempArray[i] = Character.toString((char) letter);
		}
	}

}
