package sorting;

import java.util.Arrays;

/**
 * First element will be compared with second element and then be shifted based on the condition.
 * Ascending <, Descending >
 * Stable sort as we are not using =, so the same values willn't be swapped.
 *
 * TimeComplexity: o(n2) Quadratic TimeComplexity
 */
public class BubbleSort {

    public static void main(String[] args) {
     int a[] = {12, 13, 15, -21, 55, -72, 35};
     int i =1;
     for (int lastElement=a.length-1;lastElement>0;lastElement--){
         for(int secondlast=lastElement-1;secondlast>-1;secondlast--){
             i++;
             if(a[secondlast] < a[lastElement])
                 swapArray(a,lastElement, secondlast);
         }
     }
        Arrays.stream(a).forEach(n->{
            System.out.print(n);
            System.out.print(", ");
        });
        System.out.println("No of times:"+i);
    }



    public static int[] swapArray(int[] a,int firstElement,int secondElement){
        int temp = a[firstElement];
        a[firstElement] = a[secondElement];
        a[secondElement]= temp;
        return a;
    }

}
