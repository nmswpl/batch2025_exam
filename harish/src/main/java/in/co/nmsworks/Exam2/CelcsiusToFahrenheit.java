package in.co.nmsworks.Exam2;

public class CelcsiusToFahrenheit {
    public static void main(String[] args) {
        CelcsiusToFahrenheit cf = new CelcsiusToFahrenheit();
        for (int celsius = -273; celsius <= 273 ; celsius++) {
            double fahrenheit = cf.convertCelsiusToFahrenheit(celsius);
            if (celsius == fahrenheit){
                System.out.println("The degree in celsius :"+ celsius + " is equals to degreeInfahrenheit" + fahrenheit);
            }
        }

    }

    private double convertCelsiusToFahrenheit(int celsius) {
        return (1.8 * celsius) + 32;
    }
}
