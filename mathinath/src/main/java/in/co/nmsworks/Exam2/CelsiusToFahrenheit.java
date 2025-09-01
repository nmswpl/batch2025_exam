package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
        int degreeInCelsius = 100;
        float fahrenheit = cf.convertCelsiusToFahrenheit(degreeInCelsius);
        System.out.println("The faherheit is :"+fahrenheit);
        cf.printTempertaureEqual(degreeInCelsius,fahrenheit);
    }

    private void printTempertaureEqual(int degreeInCelsius, float fahrenheit) {
        if(degreeInCelsius >= -273 && degreeInCelsius <= 273)
        {
            if (degreeInCelsius == fahrenheit)
            {
                System.out.println("Both temperatures are equal");
            }
            else
            {
                System.out.println("Both temperatures are not equal");
            }
        }
        else
        {
            System.out.println("Temperature Celsius doesn't comes under range");
        }
    }

    private float convertCelsiusToFahrenheit(int degreeInCelsius) {
        float f=0.0f;
        int C = degreeInCelsius;
        f = (float) ((1.8 * C) + 32);
        return f;
    }
}
