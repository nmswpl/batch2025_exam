package in.co.nmsworks.Exam2;

public class ArrayRotation {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotatedArray = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            int k = array.length - 1;
            for (int j = 0; j < array.length; j++) {
                rotatedArray[i][j] = array[k][i];
                k--;
            }
        }
        for (int i = 0; i < rotatedArray.length; i++) {
           for (int j = 0 ; j < rotatedArray.length ; j++){
               System.out.print(rotatedArray[i][j]);
           }
            System.out.println("");
        }
    }
}
