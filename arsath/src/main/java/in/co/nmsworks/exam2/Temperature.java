package in.co.nmsworks.exam2;

public class Temperature {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        int degreeCelcius = 36;
        t.convertCelciusToFarenheit(degreeCelcius);
        for (int i = -273; i <= 273 ; i++) {
          if(t.isCelciusEqualsToFarenheit(i)){
                System.out.println("Equal Farenheit and Celcius Value = " + i);
            }
        }
    }

    private float convertCelciusToFarenheit(int degreeCelcius) {
        float farenheit = (float) ((1.8 * degreeCelcius) + 12);
        return farenheit;
    }

    private boolean isCelciusEqualsToFarenheit(int celcius){
        int temp = celcius;
        float farenheit1 = convertCelciusToFarenheit(celcius);
        return temp == farenheit1;
    }

}
