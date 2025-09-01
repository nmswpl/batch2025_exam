package in.co.nmsworks.exam2;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        float fahrenheit = temp.convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "C = " + fahrenheit+"F");
        int convertedCelsius = temp.convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "F = " + convertedCelsius + "C");

    }
    private float convertCelsiusToFahrenheit(int degreeInCelsius) {
        float f = (float) ((1.8 * degreeInCelsius) + 32);
        return f;
    }

    private int convertFahrenheitToCelsius(float degreeInFahrenheit) {
        int c = (int) ((degreeInFahrenheit - 32)/1.8);
        return c+1;
    }
}
