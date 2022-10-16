// class practice {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=5; j++) {
//                 System.out.print(" * ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// class practice {

//     public static void singleLine() {
//         for(int i=1; i<=5; i++) {
//             System.out.print("* ");
//         }
//     }

//     public static void pattern() {
//         for(int i=1; i<=5; i++) {
//             singleLine();
//             System.out.print("\n");
//         }        
//     }

//     public static void main(String[] args) {
//         pattern();
//     }
// }

// class practice {

//     public static void singleLine(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print("* ");
//         }
//     }

//     public static void pattern() {
//         for(int i=1; i<=5; i++) {
//             singleLine(i);           
//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         pattern();
//     }
// }

// class practice {

//     public static void singleLine(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print("* ");
//         }
//     }

//     public static void pattern() {
//         for(int i=5; i>=1; i--) {
//             singleLine(i);
//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         pattern();
//     }
// }

// class practice {

//     public static void singleLine(int n) {
       
//         for(int i=1; i<=n; i++) {
         
//             System.out.print(i + " ");
            
//         }
//     }

//     public static void pattern() {
//         for(int i=5; i>=1; i--) {
//             singleLine(i);
//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         pattern();
//     }
// }

// import java.util.Scanner;
// class practice {
//     public static Scanner sc = new Scanner(System.in);

//     public static void printNumbers(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void printStars(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print("* ");
//         }
//     }

//     public static void pattern(int n) {
//         for(int i=n; i>=1; i--) {
//             if(i%2 == 0) {
//                 printNumbers(i);
//             } else {
//                 printStars(i);
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         int n = sc.nextInt();
//         pattern(n);
//     }
// }

// import java.util.Scanner;
// class practice {

//     public static Scanner sc = new Scanner(System.in);

//     public static void pattern(int n) {
//         for(int i=n; i>=1; i--) {
//             String pt = "* ";
//             String v = pt.repeat(i);
//             System.out.println(v);
//         }
//     }

//     public static void main(String[] args) {
//         int n = sc.nextInt();
//         pattern(n);
//     }
// }


// import java.util.Scanner;
// class practice {
//     public static Scanner sc = new Scanner(System.in);

//     public static void printStar(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print("* ");
//         }
//     }

//     public static void printNumber(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void pattern(int n) {
//         int line = n;
//         for(int i=0; i<=n; i++) {

//             if(i%2 == 0) printNumber(line-i);
//             else printStar(line-i);

//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         int n = sc.nextInt();
//         pattern(n);
//     }
// }


// import java.util.Scanner;
// class practice {
//     public static Scanner sc = new Scanner(System.in);

//     public static void printStar(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print("*");
//         }
//     }

//     public static void printSpace(int n) {
//         for(int i=1; i<=n; i++) {
//             System.out.print(" ");
//         }
//     }

//     public static void pattern(int n) {
//         for(int i=1; i<=n; i++) {
//             printSpace(n-i);
//             printStar(i);
//             System.out.print("\n");
//         }
//     }

//     public static void main(String[] args) {
//         int n = sc.nextInt();
//         pattern(n);
//     }
// }

import java.util.Scanner;
class practice {
    public static Scanner sc = new Scanner(System.in);

    public  static void printStar(int n) {
        for(int i=0; i<=n; i++) {
            System.out.print("* ");
        }
    }

    public static void pattern(int n) {
        for(int i=0; i<=n/2; i++) {
            printStar(i);
            System.out.print("\n");
        }

        for(int i=n/2; i>=1; i--) {
            printStar(i-1);
            System.out.print("\n");
        }
    
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        pattern(n);
    }
}