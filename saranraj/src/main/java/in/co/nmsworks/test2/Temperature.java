package in.co.nmsworks.test2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        Scanner ss = new Scanner(System.in);

        for (int i = -273; i <= 273; i++) {
            double outputValue = t.convertCelsiusToFahrenheit(i);
            if (outputValue == i) {
                System.out.println("Input degreeCelsius : " + i);
                System.out.println("Output degreeCelsius : " + outputValue);
                break;
            }
        }


    }

    private double convertCelsiusToFahrenheit(double celsius) {

        return (1.8 * celsius) + 32;
    }
}
