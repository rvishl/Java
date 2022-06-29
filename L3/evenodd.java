import java.util.Scanner;
class evenodd {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a = s.nextInt();
        int rem = (a % 2);
        if (rem == 0) { 
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}