import java.util.Scanner;

public class TempConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);
    }
}
