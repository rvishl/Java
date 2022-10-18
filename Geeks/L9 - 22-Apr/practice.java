// import java.util.Scanner;
// class practice {
//     public static Scanner sc = new Scanner(System.in);

//     // public static void printAlphabets(int n) {
//     //     // for(int i=1; i<=n; i++) {
//     //     //     char ch = (char)('a'+i-1);
//     //     //     System.out.print(ch + " ");    
//     //     // }
//     //     for(int i='a'; i<'a'+n; i++) {            
//     //         System.out.print((char)(i) + " ");    
//     //     }
//     // }

//     public static void printAlphabets(int n) {
//         for(int i='a'; i<'a'+n-1; i++) {
//             System.out.print((char)(i) + " ");
//         }
//     }
    
//     // public static void printLine(int n) {
//     //     for (int i=1; i<=n; i++) {
//     //         // printAlphabets(n);
//     //         printAlphabets(i);
//     //         System.out.print("\n");
//     //     }
//     // }

//     public static void printLine(int n) {
//         for (int i=n; i>=1; i--) {
//             // printAlphabets(n);
//             printAlphabets(i);
//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         int numberOfLines = sc.nextInt();
//         printLine(numberOfLines);
//     }
// }

import java.util.Scanner;
class practice {
    public static Scanner sc = new Scanner(System.in);

    public static void printStar(int n) {
        for(int i=1; i<=n; i++) {
            System.out.print("*");
        }
    }

    public static void printSpace(int n) {
        for(int i=1; i<=n; i++) {            
            System.out.print(" ");
        }
    }

    public static void printPattern(int n) {
        int j=1;
        for(int i=n; i>=1; i--) {
            printSpace(i-1);
            printStar(j);
            j+=2;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        printPattern(n);
    }
}