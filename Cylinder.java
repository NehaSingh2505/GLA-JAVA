import java.util.Scanner;
public class Cylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder:");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder:");
        double height = sc.nextDouble();
        double volume = 3.14* radius * radius * height;
        System.out.print("The volume of the cylinder is: " + volume);

    }
}

