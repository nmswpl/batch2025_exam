package in.co.nmsworks.test2;

public class RotateArray {

    int[][] array={{1,2,3},{4,5,6},{7,8,9}};
   public void printArray(){
       for(int i=0;i<=array.length-1;i++){
           for(int j=0;j<=i;j++){
               System.out.print(array[2][0]);
               System.out.print(array[2][1]);
               System.out.print(array[2][2]);

           }
       }
   }

    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
        rotateArray.printArray();
    }

}

