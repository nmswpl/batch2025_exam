package in.co.nmsworks.exam2;

public class MatrixRotation
{
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i =0;i<mat.length;i++){
            for(int j=i;j<mat.length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp ;
                //System.out.print(mat[i][j]);

            }
            //System.out.println("");

        }


        for(int i =0 ;i<mat.length;i++){
            int temp = mat[i][0];
            mat[i][0] = mat[i][mat.length-1];
            mat[i][mat.length-1] = temp;
        }

        System.out.println("Matrix Rotated 90 deg");
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }

    }
}
