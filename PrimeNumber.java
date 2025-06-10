import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(isPrime(n) ? "Prime Number" : "Not  a Prime Number");
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
