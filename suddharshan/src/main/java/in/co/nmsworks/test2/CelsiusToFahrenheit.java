package in.co.nmsworks.test2;

import java.util.ArrayList;
import java.util.List;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
        System.out.println(cf.convertCelsiusToFahrenheit(29));
        System.out.println(cf.getCelsiusAndFahrenheitEqualValue());
    }
    private float convertCelsiusToFahrenheit(int degreeInCelsius){
        float fahrenheit = (float) ((1.8 * degreeInCelsius) + 32);
        return fahrenheit;
    }
    private List<Integer> getCelsiusAndFahrenheitEqualValue(){
        List <Integer> equalValues = new ArrayList<>();
        for(int i = -273; i < 273; i++){
            float fahValue = convertCelsiusToFahrenheit(i);
            if(i == fahValue){
                equalValues.add(i);
            }
        }
        return equalValues;
    }
}
