package csi213.lab04;

/**
 * {@code Factorial} demonstrates factorial calculations based on recursion and iteration.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * 
 */
public class Factorial {

	/**
	 * Returns the factorial of the given integer.
	 * 
	 * @param n
	 *            an integer
	 * @return the factorial of the given integer
	 */
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	/**
	 * Returns the factorial of the given integer.
	 * 
	 * @param n
	 *            an integer
	 * @return the factorial of the given integer
	 */
	public static int factorial_iterative(int n) {
		int prod = 1;
		for (int i = 1; i <= n; i++)
			prod *= i;
		return prod;
	}

	/**
	 * The main method of the {@code Factorial} class.
	 * 
	 * @param args
	 *            the program arguments
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++)
			System.out.println(i + "! = " + factorial(i));
		System.out.println();
		for (int i = 0; i <= 4; i++)
			System.out.println(i + "! = " + factorial_iterative(i));
	}
}