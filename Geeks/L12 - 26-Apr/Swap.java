import java.util.Scanner;
class Swap {
    public static Scanner sc = new Scanner(System.in);

    static void swap(int a, int b) {
        // Swap of two numbers with temp variable
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " " + b);

        // Swap of two numbers without temp variable
        // a = a+b;
        // b = a-b;
        // a = a-b;
        // System.out.println(a + " " + b);

        // Swap of two numbers in one line
        b = ((a+b) - (a=b));
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        swap(a, b);
    }
}