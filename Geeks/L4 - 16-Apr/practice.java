import java.util.Scanner;
class practice {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // System.out.println("Enter marks of first student: ");
        // int m1 = sc.nextInt();
        // System.out.println("Enter marks of second student: ");
        // int m2 = sc.nextInt();

        // if(m1 < 50) {

        //     if(m2 < 50) {
        //         System.out.println("Both are fail");
        //     } else {
        //         System.out.println("m1 is fail but m2 is pass");
        //     }

        // } else {

        //     if(m2 < 50) {
        //         System.out.println("m1 is pass but m2 is failed");
        //     } else {
        //         System.out.println("both are passed");
        //     }

        // }

        // System.out.println(65);
        // System.out.println((char)(65));
        // System.out.println((int)('a'));

    //     System.out.println("Enter marks of m1: ");
    //     int m1 = sc.nextInt();
    //     System.out.println("Enter marks of m2: ");
    //     int m2 = sc.nextInt();

    //     if(m1 < 50 && m2 < 50) {
    //         System.out.println("Both are fail");
    //     } else if(m1 < 50 && m2 > 50) {
    //         System.out.println("m2 is pass");
    //     } else if(m1 > 50 && m2 < 50) {
    //         System.out.println("m1 is pass");
    //     } else {
    //         System.out.println("Both are pass");
    //     }


        // for(int i=0; i<5; ++i)
        //     System.out.println(i);

        // for (int i=0; i<26; i++) {
        //     // System.out.print((char)(i) + " "); //Method 1
        //     // System.out.print((char)('a' + i) + " "); //Method 2
        // }
    
        System.out.println("Enter number to prime: ");
        int n = sc.nextInt();
        boolean b = false;
        for(int i=2; i<n/2; i++) {
            if(n%i == 0) {
                b = true;
                break;
            }
        }
        if(b == true) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime number");
        }

    }
}