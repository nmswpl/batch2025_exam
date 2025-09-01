package in.co.nmsworks.exam2;
/*
Implement the following method that converts a temperature from Celsius to Fahrenheit
private float convertCelsiusToFahrenheit(int degreeInCelsius)
using the formula:
F = (1.8 * C) + 32
Also write a program to find the temperature at which input degressInCelsius is equal to the
output degreeInFahrenheit. (Celsius range is from -273 to 273)
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.commonMethod();
    }

    private void commonMethod() {
        for (int i = -273; i < 273; i++) {
            float fahrenheit = convertCelsiusToFahrenheit(i);
            if ((float)i == fahrenheit){
                System.out.println("Celsius  " + i + " fahrenheit   " + fahrenheit);
            }
//            System.out.println(fahrenheit);
        }
    }

    private float convertCelsiusToFahrenheit(int celsius) {
        float fahrenheit = (float) ((1.8 * celsius) + 32);
        return fahrenheit;
    }
}
