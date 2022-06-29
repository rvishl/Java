import java.util.Scanner;
class grather {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter first number: ");
        a = s.nextInt();
        System.out.println("Enter second number: ");
        b = s.nextInt();
        if (a > b) {
            System.out.println("first number is grather");
        } else if (a < b) {
            System.out.println("Second number is grather");
        } else {
            System.out.println("Both are equal");
        }
    }
}