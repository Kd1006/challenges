package HackerRank;

import java.util.Scanner;

public class temperatureConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        double fahrenheit = scanner.nextDouble();
        double celsius  = (fahrenheit -32)*5/9;
        System.out.println( fahrenheit + " is in fahrenheit is " + celsius + " in celsius ");

        // Celsius to Fahrenheit
//        System.out.println("Enter the temperature in celsius");
//        double celsius = scanner.nextDouble();
//        double fahrenheit  = (celsius * 9/5) +32;
//        System.out.println( celsius + " is in celsius is " + fahrenheit+ " in fahrenheit");

    }
}




