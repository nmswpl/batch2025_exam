package in.co.nmsworks.exam2;

import java.util.Scanner;

/* Implement the following method that converts a temperature from Celsius to Fahrenheit
private float convertCelsiusToFahrenheit(int degreeInCelsius)
using the formula:
F = (1.8 * C) + 32
Also write a program to find the temperature at which input degressInCelsius is equal to the
output degreeInFahrenheit. (Celsius range is from -273 to 273)*/
public class CelciusToFahrenheit {
    public static void main(String[] args) {

        CelciusToFahrenheit ctf = new CelciusToFahrenheit();

        int i= -273;
        while(i<=273) {
            float fahrenheit = ctf.convertCelsiusToFahrenheit(i);
            if (fahrenheit == i) {
                System.out.println("The fahrenheit for the celcius  " + i + " is : " + fahrenheit);
                break;
            }
            else{
                i++;
            }
        }


    }
    private float convertCelsiusToFahrenheit(int degreeInCelsius){

        float fahrenheit  =(float) (1.8 * degreeInCelsius) + 32 ;
        int answer = 0;
        if(degreeInCelsius == fahrenheit ) {
            answer = degreeInCelsius ;
        }
        return  answer ;
    }
}
