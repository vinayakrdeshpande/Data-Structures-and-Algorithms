package sorting;


import java.util.Arrays;

/**
 * Assuming Ascending
 * Step 1: Default 1st element is maximum.
 * Step 2: Compare tis value with other values if found maximum swap the values
 * Step 3: this will be executed in loop till new sorted array has all the fields compared to the existing
 *
 * Ascending <, Descending >
 * Stable sort as we are not using =, so the same values willn't be swapped.
 *
 * TimeComplexity: o(n2) Quadratic TimeComplexity
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex=a.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largest= 0;
            for (int i = 1; i <=lastUnsortedIndex ; i++) {
                if(a[i]>a[largest]) //for ascending
                    largest=i;
            }
            swapValues(a, largest, lastUnsortedIndex);
        }
        Arrays.stream(a).forEach(n->{
            System.out.print(n+", ");
        });
    }

    private static void swapValues(int[] a, int largest, int lastUnsortedIndex) {
        int temp=a[largest];
        a[largest]=a[lastUnsortedIndex];
        a[lastUnsortedIndex]=temp;
    }


}
