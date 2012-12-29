package algorithms;

import programming.contract.*;

public class ArrayAlgorithms {

	/**
	 * Fill an array with a sequence starting with startValue in element 0, and 
	 * for each element i after 0 the value stored at the element i will be a[i] = 
	 * a[i - 1] + increment value.
	 * 
	 * @param a [out] The array to be filled.
	 * @param startValue The value to store at element 0.
	 * @param incrementValue The value to use as the increment value when filling the array
	 * with a sequence of numbers.
	 * @throws PreconditionError if the array is null or the length is less than 1.
	 * @throws InterruptedException
	 */
	public static void fill(int [] a, int startValue, int incrementValue) throws PreconditionError, InterruptedException {
		PreconditionError.Test(a == null || a.length < 1, "The array must have at least one element.");
		
	}

	/**
	 * Swap two values stored in a at indexes i and j.
	 * 
	 * 
	 * @param a [in/out] The values will be take from and stored in this array.  I.e.
	 * the swap will be in place.
	 * 
	 * @param i The index of the first value to be exchanged.
	 * @param j The index of the second value ot be exchanged.
	 * @throws PreconditionError if i or j are out of bounds of the array a.
	 */
	public static void swap(int [] a, int i, int j) throws PreconditionError {
		PreconditionError.Test(a == null || a.length < 1, "The array must have at least one element.");
		PreconditionError.Test(i < 0 || i >= a.length, "Index i is out of range.");
		PreconditionError.Test(j < 0 || j >= a.length, "Index j is out of range.");
		
	}
	
	/**
	 * Reverse the order of the elements stored in a.
	 * If a is null or a's length is less than 2, then do nothing, and return.
	 * 
	 * HINT: Use the swap function in a loop.
	 * 
	 * @param a [in/out] The values will be take from and stored in the same array.  I.e.
	 * the reverse algorithm will be run in place.
	 * @throws PreconditionError
	 * @throws InterruptedException
	 */
	public static void reverse(int [] a) throws PreconditionError, InterruptedException {
	}

	/**
	 * 
	 * @param a
	 * @return The smallest value stored in a.
	 */
	public static int findMin(int [] a) {
		return 0;
	}

	/**
	 * 
	 * @param a
	 * @return The largest value stored in a.
	 */
	public static int findMax(int [] a) {
		return 0;
	}

	/**
	 * Shuffle the values stored in a using the Fisher-Yates shuffle algorithm
	 * described at: 
	 * 
	 * http://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
	 * 
	 * Implements the "Modern Algorithm" version described on the page.
	 * @param a
	 */
	public static void shuffle(int [] a) {
		
	}
}
