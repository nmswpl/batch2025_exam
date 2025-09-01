package in.co.nmsworks.exam2;

public class Celcius
{
    public static void main(String[] args)
    {
        Celcius cs = new Celcius();
        int num=211;
        float finalNum = cs.convertCelsiusToFahrenheit(num);
        System.out.println("Celcius : "+num+"\nFahrenheit : "+finalNum);
        System.out.println();
        float uniqueVal = cs.finalTheUniqueValue();
        System.out.println(uniqueVal+" is the Unique Celcius");
    }
//    Implement the following method that converts a temperature from Celsius to Fahrenheit
//    private float convertCelsiusToFahrenheit(int degreeInCelsius)
//    using the formula:
//    F = (1.8 * C) + 32
//    Also write a program to find the temperature at which input degressInCelsius is equal to the
//    output degreeInFahrenheit. (Celsius range is from -273 to 273)
    private float finalTheUniqueValue()
    {
        float finalNum=0;
        int start=-273;
        int end = 272;
        for(int i=-273 ; i<=273 ;i++)
        {
            finalNum=(float)(1.8*i)+32;
            if(finalNum==i)
            {
//                System.out.println(finalNum + " is " + i);
                break;
            }
        }
        return finalNum;
    }
    private float convertCelsiusToFahrenheit(int degreeInCelsius)
    {
        float tempNum = (float)degreeInCelsius;

        float finalNum=0;

            finalNum=(float)(1.8*degreeInCelsius)+32;

        return finalNum;
    }
}
