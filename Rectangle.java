import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the length of the rectangle:");
        double length=sc.nextDouble();
        System.out.print("enter the breadth of the rectangle:");
        double breadth=sc.nextDouble();
        double area=length*breadth;
        System.out.println("the area of the rectangle is:"+ area);
        
    }}

