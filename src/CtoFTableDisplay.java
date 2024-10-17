public class CtoFTableDisplay {

    // Main method to create the table display
    public static void main(String[] args) {
        // Print header for the table
        System.out.printf("%-10s %-10s\n", "Celsius", "Fahrenheit");

        // Loop from -100 to 100 and print the Celsius and Fahrenheit values
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Call the CtoF method to convert Celsius to Fahrenheit
            double fahrenheit = CtoF(celsius);
            // Print the Celsius and Fahrenheit values formatted to one decimal point
            System.out.printf("%-10d %-10.1f\n", celsius, fahrenheit);
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double celsius) {
        // Formula to convert Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }
}

