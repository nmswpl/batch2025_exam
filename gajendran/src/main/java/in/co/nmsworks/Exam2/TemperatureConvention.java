package in.co.nmsworks.Exam2;

public class TemperatureConvention
{
    private float convertCelsiusToFahrenheit(int degreeInCelsius)
    {
        return (float) (1.8 *degreeInCelsius) + 32;
    }

    private void findEqualValueOfFahrenheitAndCelsiusDuringConverstion(int start, int end)
    {
        for (int i = start; i <= end; i++)
        {
             if (convertCelsiusToFahrenheit(i) == i)
             {
                 System.out.println("Degress In Celsius : "+i);
                 System.out.println("Degree In Fahrenheit : "+convertCelsiusToFahrenheit(i));
             }
        }
    }

    public static void main(String[] args)
    {
        TemperatureConvention temperatureConvention = new TemperatureConvention();
        temperatureConvention.findEqualValueOfFahrenheitAndCelsiusDuringConverstion(-273,273);
    }
}
