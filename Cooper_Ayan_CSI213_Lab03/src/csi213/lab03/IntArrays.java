package csi213.lab03;

/*
 * Task 1. Complete the "fill(int[] a, int val)" method (using a loop) so that it fills the 
 * specified array (argument "a") with the specified value (argument "val"). For example, "fill(b, -1)" 
 * needs to set all of the members of "b" to -1.
 * 
 * Task 2. Implement the "copyOf(int[] original)" method so that it returns a copy of the specified 
 * array (argument "original"). What this method returns must be a new array such that (i) its length is the 
 * same as the length of the specified array (argument "original") and (ii) its member at each index is the 
 * same as the member at the same index in "original".
 * 
 * Task 3. Complete the "subarray(int[] original, int startIndex, int endIndex)" method so that 
 * it returns a new array that corresponds to a sub-array of the specified array (argument "original"). 
 * This sub-array begins at the specified "beginIndex" and extends to the element at index ("code endIndex" - 1) 
 * and thus the length of the sub-array is ("endIndex"-"beginIndex"). For example, consider an array "a" 
 * consisting of integers 0, 1, 2, 3, 4.
 */

import java.util.Arrays;

/**
 * This {@code IntArrays} class provides methods for manipulating {@code int} arrays.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class IntArrays {

	/**
	 * Assigns the specified {@code int} value to each element of the specified {@code int} array.
	 *
	 * @param a
	 *            the array to be filled
	 * @param val
	 *            the value to be stored in all elements of the array
	 */
	public static void fill(int[] a, int val) {
		for (int i = 0; i < a.length; i++) {
			a[i] = val;
		}
	}

	/**
	 * Constructs a copy of the specified array.
	 * 
	 * @param original
	 *            an {@code int} array
	 * @return the constructed array
	 */
	public static int[] copyOf(int[] original) {
		int[] copy = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}
		return copy;
	}

	/**
	 * Returns a sub-array of the specified array. The sub-array begins at the specified {@code beginIndex} and extends
	 * to the element at index {@code endIndex - 1} and thus the length of the sub-array is {@code endIndex-beginIndex}.
	 *
	 * @param beginIndex
	 *            the beginning index, inclusive
	 * @param endIndex
	 *            the ending index, exclusive
	 * @return the specified sub-array
	 */
	public static int[] subarray(int[] original, int startIndex, int endIndex) {
		int[] sub = new int[endIndex - startIndex];
		for (int i = 0; i < sub.length; i++, startIndex++) {
			sub[i] = original[startIndex];
		}
		return sub;
	}

	/**
	 * The main method of the {IntArrays} class.
	 * 
	 * @param args
	 *            the program arguments
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++)
			a[i] = i;
		System.out.println(Arrays.toString(a));

		int[] b = new int[4];
		System.out.println(Arrays.toString(b));
		fill(b, -1);
		System.out.println(Arrays.toString(b));

		b = copyOf(a);
		System.out.println(Arrays.toString(b));
		fill(b, -1);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.toString(subarray(a, 0, a.length)));
		System.out.println(Arrays.toString(subarray(a, 1, a.length)));
		System.out.println(Arrays.toString(subarray(a, 1, a.length - 1)));
	}

}
