import java.util.Scanner;
class Factorial {
    public static Scanner sc = new Scanner(System.in);

    static int factorial(int n) {
        int product=1;
        for(int i=1; i<=n; i++) {
            product = product * i;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.print("Enter number to find factorial: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.print("Factorial of " + n + " is " + result);
    }
}