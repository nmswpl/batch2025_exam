package in.co.nmsworks.exam2;


public class TemperatureConverter {

    private float CelsiusToFahrenheit(int degreeInCelsius) {
        return (float)((1.8 * degreeInCelsius) + 32);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        int celsius = 25;
        System.out.println("celsius " + celsius + " =fahrenheit " + converter.CelsiusToFahrenheit(celsius));


        for (int c = -273; c <= 273; c++) {
            float f = converter.CelsiusToFahrenheit(c);
            if (Math.abs(f - c) < 0.001) {
                System.out.println("Temperature Celsius equals Fahrenheit: "+c);
                break;
            }
        }
    }
}

