package in.co.nmsworks.exam2;

public class CelsiusToFarenheit
{
    public static void main(String[] args) {
        CelsiusToFarenheit cToF = new CelsiusToFarenheit();

        for(int i = -273;i<273;i++){
            float fahrenheit = cToF.convertCelsiusToFahrenheit(i);
            float ii = (float) i;
            if(i==fahrenheit){
                System.out.println(i);
            }
        }
    }

    public float convertCelsiusToFahrenheit(int C){
       float Faren = (float) ((1.8 * C) + 32);
       return Faren;
    }
}
