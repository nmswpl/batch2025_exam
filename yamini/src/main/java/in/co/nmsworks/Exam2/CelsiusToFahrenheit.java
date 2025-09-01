package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter celsius: ");
        int degreeInCelsius = scan.nextInt();
        CelsiusToFahrenheit cf= new CelsiusToFahrenheit();
        float result=cf.convertCelsiusToFahrenhiet(degreeInCelsius);
        System.out.println(result);
         float sameDegree=cf.findSame();
        System.out.println("The value which is same in both: "+sameDegree);
    }

    private float convertCelsiusToFahrenhiet(int input) {
        float fahrenheit = (float) ((1.8 * input) + 32);
        return fahrenheit;
    }

    private  float findSame(){
        float degree = 0.0f;
        for(int i=-273 ; i<= 273 ; i++){
            float fahrenheit = (float) ((1.8 * i) + 32);
            if(i==fahrenheit){
                degree=i;
            }
        }
        return degree;
    }
}
