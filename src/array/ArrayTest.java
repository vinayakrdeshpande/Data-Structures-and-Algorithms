package array;

/**
 * Sample Array definition.
 * Memory allocation=b(bytes), Random address=a, index i
 * a+(i*b).....a+(n*b)
 * Memory allocation of an Array is continous as array stores same bytes of data.
 *
 * TimeComplexity: o(n) Linear TimeComplexity
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] sampleInt = new int[7];
        sampleInt[0]= 1;
        sampleInt[1]= 5;
        sampleInt[2]= 7;
        sampleInt[3]= 5;
        sampleInt[4]= 98;
        sampleInt[5]= 41;
        sampleInt[6]= -25;
    }
}
