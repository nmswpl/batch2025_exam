package in.co.nmsworks.test2;

public class Pattern {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.generatePattern(9);
    }
    public void generatePattern(int row){
        for(int i = 0; i < row; i++){
            if(i == 0 || i == row-1){
                for(int j = 0; j < row; j++){
                    System.out.print(i+1 + " ");
                }
                System.out.println();
            }
            else{
                for(int j = 0; j < row; j++){
                    if(j == 0 || j == row-1){
                        System.out.print(i+1 + " ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }
    }
}