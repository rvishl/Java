import java.util.Scanner;
class Sum {
    public static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int a=S.nextInt();
        int b = S.nextInt();
        int c = a+b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }
}