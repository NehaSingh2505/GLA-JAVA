import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the principal amount: ");
    double principal = sc.nextDouble();
    System.out.print("Enter the rate of interest (in %): ");
    double rate = sc.nextDouble();
    System.out.print("Enter the time (in years): ");
    double time = sc.nextDouble();
    double simpleInterest = (principal * rate * time) / 100;    
    System.out.printf("The simple interest is: %.2f%n", simpleInterest);

}
}