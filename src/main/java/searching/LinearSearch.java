/**
 * 
 */
package searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Linear search.
 * Searching an element till it find the exact value.
 * 
 * @author vinayak
 *
 *Best Time complexity=O(1) and worst/Average time complexity=O(n)
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] data = { 5, 9, 1, 3, 6, 0 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Number");
		int valueToSearch = sc.nextInt();

		boolean result = searchValue(data, valueToSearch);

		if (result)
			System.out.println("Number found !!!!!!");
		else
			System.out.println("Number didnt found");

	}

	private static boolean searchValue(int[] data, int valueToSearch) {
		/**
		 * Traditional way of iterating loops
		 * 
		  for (int i = 0; i < data.length; i++) 
		  { 
		  if (data[i] == valueToSearch) 
		    return true; } 
		    return false;
		 */

		//Using streams and lambda to match the value
		boolean result = Arrays.stream(data).anyMatch(val -> (val == valueToSearch));
		return result;
	}

}
