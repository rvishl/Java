/**
* <h1>Prime Number Program </h1>
* This program implements an application that simply check whether the number is prime or not,
*
*
*@author vishal
*@version 1.0
*@since 2022-05-07
*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Not a Prime Number"); 
        } else {
            int ct=0;
            for (int i=2; i<=n/2; i++) {
                if (n%i == 0) {
                    ct++;
                }
            }
            if (ct == 0)
                System.out.println("Prime Number");
            else
                System.out.println("Not a Prime Number");
        }
    }
}