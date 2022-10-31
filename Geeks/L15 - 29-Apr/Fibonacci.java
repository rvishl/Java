import java.util.Scanner;
class Fibonacci {
    public static Scanner sc = new Scanner(System.in);

    static int fibonacci(int ele) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1; i<ele-1; i++) {
            c=a+b;            
            a=b;
            b=c;
        }        
        return c;
    }

    public static void main(String[] args) {
        System.out.print("Enter nth element which you want: ");
        int ele = sc.nextInt();
        int result = fibonacci(ele);
        System.out.print(ele + "th element is " + result);
    }
}