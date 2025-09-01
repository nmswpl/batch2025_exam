package in.co.nmsworks.test2;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] mat  = new int [3][3];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[1][0] = 4;
        mat[1][1] = 5;
        mat[1][2] = 6;
        mat[2][0] = 7;
        mat[2][1] = 8;
        mat[2][2] = 9;
        RotateMatrix rm = new RotateMatrix();
        rm.rotate(mat);
    }
    public void rotate(int [][] mat){
        for(int i = mat.length-1; i >= 0; i--){
            for(int j = 0;j < mat.length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
