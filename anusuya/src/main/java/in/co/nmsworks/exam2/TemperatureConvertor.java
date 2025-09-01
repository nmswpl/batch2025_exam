package in.co.nmsworks.exam2;

import java.util.Scanner;

public class TemperatureConvertor {

    private static TemperatureConvertor tc;

    public static void main(String[] args) {

        tc = new TemperatureConvertor();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in celsius : ");
        int degreeInCelsius = sc.nextInt();

        float degreeInFahrenheit = tc.convertCelsiusToFahrenheit(degreeInCelsius);
        System.out.println(degreeInCelsius + " in Fahrenheit : " + degreeInFahrenheit);

        tc.findTemperatureHavingSameFahrenheitAndCelsiusValue();
    }

    private float convertCelsiusToFahrenheit(int degreeInCelsius){

        return (float) ((1.8 * degreeInCelsius)+32);
    }

    private void findTemperatureHavingSameFahrenheitAndCelsiusValue() {

        for (int i = -273; i <= 273; i++){
            float resultedFahrenheit = tc.convertCelsiusToFahrenheit(i);
            if (resultedFahrenheit == (float)i){
                System.out.println("This is the temperature having same farenheit and celsius value : " + resultedFahrenheit);
                break;
            }
        }
    }
}
