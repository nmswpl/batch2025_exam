package in.co.nmsworks.test2;

public class CelsiusFahrenheitConvertion
{
    public static void main(String[] args)
    {
        CelsiusFahrenheitConvertion cfc = new CelsiusFahrenheitConvertion();

        for (int i = -273; i <= 273; i++)
        {
            float fahrenheit = cfc.convertCelsiusToFahrenheit(i);

            if (i == fahrenheit)
            {
                System.out.println("Celsius " + i + " Fahrenheit " + fahrenheit + " Are the Same");
            }
        }
    }
    private float convertCelsiusToFahrenheit(int degreeInCelsius)
    {
        double fahrenheit;
        fahrenheit = (1.8 * degreeInCelsius) + 32;
        return (float)fahrenheit;
    }
}
