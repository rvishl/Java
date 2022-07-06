import java.util.Scanner;
class GreaterTwo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is greater");
        else
            System.out.println(b + " is greater");
    }
}