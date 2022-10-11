import java.util.Scanner;
class practice {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // System.out.println("Enter your name: ");
        // String str = sc.nextLine();
        // System.out.println(str);
        // long a = sc.nextLong();
        // System.out.println(a);
        // String str1 = sc.next();
        // String str2 = sc.next();
        // String str3 = str1 + str2;
        // System.out.println(str3);

        // System.out.println("Enter length of Rectangle: ");
        // int l = sc.nextInt();
        // System.out.println("Enter width of Rectangle: ");
        // int b = sc.nextInt();
        // if(l == b) {
        //     System.out.println("Square");
        // } else {
        //     System.out.println("Rectangle");
        // }

        // System.out.println("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int b = sc.nextInt();

        // if(a > b) {
        //     System.out.println(a + " is grather than " + b);
        // } else {
        //     System.out.println(b + " is grather than " + a);
        // }

        // System.out.println("Enter number: ");
        // int a = sc.nextInt();

        // if(a%2 == 0) {
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }

        System.out.println("Enter hours");
        int hrs = sc.nextInt();
        if(hrs >= 0 && hrs < 12) {
            System.out.println("Good morning");
        } else if(hrs >= 12 && hrs <= 16) {
            System.out.println("Good afternoon");
        } else if(hrs > 16 && hrs <= 20) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
    }
}