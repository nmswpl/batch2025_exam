package in.co.nmsworks.exam2;

public class RotateSquareMatrix {
    public static void main(String[] args) {
        RotateSquareMatrix rs = new RotateSquareMatrix();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rs.rotateSqaureMatrix(arr);
    }

    public void rotateSqaureMatrix(int[][] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = arr.length-1 ; j >= 0 ; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
