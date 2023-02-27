package csi213.lab05;

import java.util.Arrays;

/**
 * This {@code FloatArrays} class provides methods for manipulating {@code Float} arrays.
 */
public class FloatArrays {

	/**
	 * Sorts the specified array using the bubble sort algorithm.
	 * 
	 * @param a
	 *            an {@code Float} array
	 */
	public static void bubbleSort(float[] a) {
		System.out.println(Arrays.toString(a));
		for (int last = a.length - 1; last >= 1; last--) {
			// TODO: add some code here
			for (int first = a.length - last; first >= 1; first--) {
				if (a[first] < a[first - 1]) {
					float temp = a[first];
					a[first] = a[first - 1];
					a[first - 1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(a));
	}

	/**
	 * Sorts the specified array using the selection sort algorithm.
	 * 
	 * @param a
	 *            an {@code Float} array
	 * @param out
	 *            a {@code PrintStream} to show the array at the end of each pass
	 */
	public static void selectionSort(float[] a) {
		System.out.println(Arrays.toString(a));
		for (int last = a.length - 1; last >= 1; last--) {
			// TODO: add some code here
			int maxIndex = last;
			float maxValue = a[last];
			for (int index = 0; index < last; index++) {
				if (a[index] > maxValue) {
					maxValue = a[index];
					maxIndex = index;
				}
			}
			a[maxIndex] = a[last];
			a[last] = maxValue;
		}
		System.out.println(Arrays.toString(a));
	}

	/**
	 * Sorts the specified array using the quick sort algorithm.
	 * 
	 * @param a
	 *            an {@code Float} array
	 * @param out
	 *            a {@code PrintStream} to show the array at the end of each pass
	 */
	public static void quickSort(float[] a) {
		System.out.println(Arrays.toString(a));
		for (int index = 1; index <= a.length - 1; index++) {
			// TODO: add some code here
			useQuickSort(a, 0, a.length - 1);
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void useQuickSort(float[] a, int low, int high) {
		System.out.println(Arrays.toString(a));
		if (low < high && low >= 0 && high >= 0) {
			int index = partition(a, low, high) ;
			useQuickSort(a, low, index);
			useQuickSort(a, index + 1, high);
		}
	}
	
	private static int partition(float[] a, int low, int high) {
		float pivot = a[(high + low) / 2];
		while(true) {
			while (a[low] < pivot) {
				low++;
			}
			while (a[high] > pivot) {
				high--;
			}
			if (low >= high) {
				return high;
			}
			float temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			
			low++;
			high--;
		}
	}

	/**
	 * The main method of the {@code FloatArrays} class.
	 * 
	 * @param args
	 *            the program arguments
	 */
	public static void main(String[] args) {
		float[] a = { 5.3F, 3.8F, 1.2F, 2.7F, 4.99F };

		bubbleSort(Arrays.copyOf(a, a.length));
		System.out.println();

		selectionSort(Arrays.copyOf(a, a.length));
		System.out.println();

		quickSort(Arrays.copyOf(a, a.length));
		System.out.println();
	}

}