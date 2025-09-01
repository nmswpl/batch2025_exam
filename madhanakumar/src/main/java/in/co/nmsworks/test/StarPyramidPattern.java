package in.co.nmsworks.test;

public class StarPyramidPattern {
    public static void main(String[] args) {
        StarPyramidPattern starPyramidPattern = new StarPyramidPattern();
        starPyramidPattern.printPattern(5);
//        starPyramidPattern.printPattern(8);
    }

    private void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
