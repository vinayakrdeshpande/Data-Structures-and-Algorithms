package searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
* Binary Search
* 1. The data must be sorted
* 2. Divide and conquer the search
* 
* Time Complexity:
* Space Complexity:
 */
public class BinarySearch {

	private static boolean binarySearch(List<Integer> lst, int key, int high, int low) {
		
		int mid;
		while(low <= high) {
		  mid = (low+high)/2;	 
		  if(lst.get(mid)==key) {
			  System.out.println("Found at index "+mid);
			  return true;
		  }
		  else if(lst.get(mid)<key) {
			  low = mid+1;
		  }
		  else
			  high = mid-1;
		}
		
		return false;
	}
    public static void main(String[] args) {
     
    	//List of data
    	List<Integer> arrayList = Arrays.asList(1,10,55,66,68,85,101,110,125,179,201,356,1000);
    	
    	//Accept the key to search for
    	System.out.println("Enter the key to search for: ");
    	Scanner sc = new Scanner(System.in);
    	int key = sc.nextInt();
    	
    	//Sort the list
    	Collections.sort(arrayList);
    	
    	int high = arrayList.size()-1;
    	int low = 0;
    	
    	boolean result = binarySearch(arrayList, key, high, low);
    	
    	if(!result) {System.out.println("Data not found");}
    	
    	
    }
private static boolean binarySearchnew(List<Integer> lst, int key, int high, int low) {
		
		int mid;
		while(low <= high) {
		  mid = (low+high)/2;	 
		  if(lst.get(mid)==key) {
			  System.out.println("Found at index "+mid);
			  return true;
		  }
		  else if(lst.get(mid)<key) {
			  low = mid+1;
		  }
		  else
			  high = mid-1;
		}
		
		return false;
	}
}
