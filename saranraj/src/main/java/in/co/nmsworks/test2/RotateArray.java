package in.co.nmsworks.test2;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        ra.rotateAndPrint();

    }

    private void rotateAndPrint() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] rotate = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotate[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int left = 0;
                int right = arr.length - 1;
                while (left <= right) {
                    int temp = rotate[i][left];
                    rotate[i][left] = rotate[i][right];
                    rotate[i][right] = temp;
                    left++;
                    right--;
                }


            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate[i][j]);
            }
            System.out.println();
        }
    }
}
