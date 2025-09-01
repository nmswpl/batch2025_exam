package in.co.nmsworks.exam2;

public class CtoF
{
    public static void main(String[] args) {
      //  private float convertCelsiusToFahrenheit(int degreeInCelsius)
        float degreeCel = 1020.0f;
        convertCelsiusToFahrenheit(degreeCel);


    }
    private static  float convertCelsiusToFahrenheit(float degreeInCelsius)
    {
//        (Celsius range is from -273 to 273)
        float f = (float) ((1.8 * degreeInCelsius) +32);
        //System.out.println(f);
        if (f <= -273 )
        {
            System.out.println(f);
        } else if (f <= 273)
        {
            System.out.println(f);

        } else {
            System.out.println(" not DtoF " );
        }
        return f;

    }



}
