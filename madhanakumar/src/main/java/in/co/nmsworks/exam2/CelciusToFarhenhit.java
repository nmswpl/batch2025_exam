package in.co.nmsworks.exam2;

public class CelciusToFarhenhit {
    private float convertCelsiusToFahrenheit(int celsiusDegree) {
        return (float) (1.8 * celsiusDegree + 32);
    }

    public static void main(String[] args) {
        CelciusToFarhenhit converter = new CelciusToFarhenhit();
        int matchingTemperature = Integer.MIN_VALUE;
        for (int celsius = -273; celsius <= 273; celsius++) {
            float fahrenheit = converter.convertCelsiusToFahrenheit(celsius);
            if (Math.abs(fahrenheit - celsius) < 0.0001) {
                matchingTemperature = celsius;
                break;
            }
        }
        if (matchingTemperature != Integer.MIN_VALUE) {
            System.out.println("Temperature at which Celsius equals Fahrenheit: " + matchingTemperature + "°");
        } else {
            System.out.println("No temperature in the given range where Celsius equals Fahrenheit.");
        }
    }
}
