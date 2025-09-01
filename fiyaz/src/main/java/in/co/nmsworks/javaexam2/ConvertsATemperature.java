package in.co.nmsworks.javaexam2;

import java.util.Scanner;

public class ConvertsATemperature {

    public static void main(String[] args) {

        ConvertsATemperature convertsATemperature = new ConvertsATemperature();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Celsius :: ");
        int num = scanner.nextInt();
        float fahrenheit = convertsATemperature.convertCelsiusToFahrenheit(num);

        System.out.println(fahrenheit);

    }

    public float convertCelsiusToFahrenheit(int degreeInCelsius) {
        return (float) ((1.8 * degreeInCelsius) + 32);
    }
}
