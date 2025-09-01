package in.co.nmsworks.test;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        MergeTwoArray mergeTwoArray = new MergeTwoArray();
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
//        mergeTwoArray.mergeArray(array1, array2);
        int[] finalArray = new int[array1.length+array2.length];
        System.arraycopy(array1,0,finalArray,0,array1.length);
        System.arraycopy(array2,0,finalArray,array1.length,array2.length);
        System.out.println(Arrays.toString(finalArray));
    }

    private void mergeArray(int[] array1, int[] array2) {
        int[] finalArray = new int[array1.length+array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            finalArray[i] = array1[i];
        }
        for (int j = array2.length; j < finalArray.length; j++) {
            finalArray[j] = array2[count];
            count++;
        }
        for (int k = 0; k < finalArray.length ; k++){
            System.out.print(finalArray[k]);
        }
    }
}
