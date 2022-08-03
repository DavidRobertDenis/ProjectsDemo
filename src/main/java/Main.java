import java.util.Scanner;

/*
 * Write a temperature conversion program which converts
 * > Fahrenheit to Celsius and
 * > Celsius to Fahrenheit
 * using switch statement in Java.
 */

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for Fahrenheit to Celsius \n"
                + "Enter 2 for Celsius to Fahrenheit conversion : ");
        int operation = scanner.nextInt();

        System.out.print("Enter temperature : ");
        float temperature = scanner.nextFloat();

        float convertedTemperature = 0f;

        /*
         * Perform temperature conversion using switch statement in Java.
         */
        switch (operation) {

            //Fahrenheit to Celsius temperature conversion
            case 1 -> {
                convertedTemperature = ((temperature - 32) * 5) / 9;
                System.out.println(temperature + " Fahrenheit " + " in Celsius = "
                        + convertedTemperature);
            }

            //Celsius to Fahrenheit temperature conversion
            case 2 -> {
                convertedTemperature = (9 * temperature / 5) + 32;
                System.out.println(temperature + " Celsius " + " in Fahrenheit = "
                        + convertedTemperature);
            }
            default -> // optional
                    System.out.println("Entered temperature is not valid");
            // optional
        }
    }
}
/*OUTPUT
Enter 1 for Fahrenheit to Celsius
Enter 2 for Celsius to Fahrenheit conversion : 1
Enter temperature : 100
100.0 Fahrenheit  in Celsius = 37.77778
*/


/*
Enter 1 for Fahrenheit to Celsius
Enter 2 for Celsius to Fahrenheit conversion : 2
Enter temperature : 37.77
37.77 Celsius  in Fahrenheit = 99.986
*/