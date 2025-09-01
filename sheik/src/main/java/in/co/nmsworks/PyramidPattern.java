package in.co.nmsworks;

public class PyramidPattern
{
    public static void main(String[] args) {
        int row = 4;
        printPyramid(row);
    }

    public static void printPyramid(int row){
        for(int i=1;i<=row;i++){
            int space = row - i;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j>j/2){
                    System.out.print(((j-i)*2)-j);
                }
                else {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}

