package sorting;

import java.util.Arrays;

/**
 * Step 1: Default 1st element is sorted will be added in sorted Array.
 * Step 2: Second element will be compared in the sorted Array and will added accordingly
 * Step 3: this will be executed in loop till new sorted array has all the fields compared to the existing
 *
 * Ascending <, Descending >
 * Stable sort as we are not using =, so the same values willn't be swapped.
 *
 * TimeComplexity: o(n2) Quadratic TimeComplexity
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex=1; firstUnsortedIndex<a.length; firstUnsortedIndex++){
            int newElement= a[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex; i>0 && a[i-1]>newElement;i--){
                a[i]=a[i-1];
            }
               a[i] = newElement;
        }

        Arrays.stream(a).forEach(n->{
            System.out.print(n);
            System.out.print(", ");
        });
    }
}