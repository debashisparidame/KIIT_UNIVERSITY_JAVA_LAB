package KIIT_University.Assignment_3;
/*
                                      Assignment – 3
                          (Operators and Command line argument )

1. Convert the temperature readings given in degree Fahrenheit to degree Celsius, using the following formula :
   C = (5/9) * (F - 32)
   Test these values in degree Fahrenheit using CLA: 68, 150, 212, 0, -22, -200.
*/
public class FahrenheitToCelsius {
    public static void main(String[] args) {

        //Fahrenheit temperature readings
        double[] fahrenheitReadings = {68, 150, 212, 0, -22, -200};

        for(double fahrenheit : fahrenheitReadings)
        {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.printf("%.2f°F is equal to %.2f°C\n", fahrenheit, celsius);
        }
    }
}