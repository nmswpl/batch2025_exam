package in.co.nmsworks.test2;

import java.util.Scanner;

public class TemperatureCalculation {
    private float convertCelsiusToFahrenheit(int degreeInCelsius) {

        Scanner details = new Scanner(System.in);
        System.out.println("enter the value : ");

        float C = details.nextFloat();

        if (C >= -275 && C <= 255) {
            float f = (float) ((1.8 * C) + 32);

            System.out.println("calculation of : "+f);
            if(f==C){
                System.out.println("same temperature :"+C);

            }
        } else {
            System.out.println("Invalid number : ");

        }
            return degreeInCelsius;
    }

    public static void main(String[] args) {
        TemperatureCalculation tem=new TemperatureCalculation();
        tem.convertCelsiusToFahrenheit(22);
    }

}
