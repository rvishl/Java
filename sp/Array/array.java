/*class array {

    static int sort(int[] a) {

        for (int i=0; i<a.length; i++) {
            
            int temp;
            boolean b = false;

            for (int j=0; j<a.length-1-i; j++) {

                if (a[j] > a[j+1]) {

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    b = true;

                }
            }

            if (b == false) 
                break;

        }
        
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] a = {40, 20, 70, 80, 10, 60, 90, 30, 50};
        sort(a);
    }

}*/

/*class array {

    static int stringSort(String[] s) {

        for (int i=0; i<s.length; i++) {

            String temp;

            for (int j=0; j<s.length-1; j++) {
                if (s[j].compareTo(s[j+1]) > 0) {
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }

            }
            
        }

        for (int i=0; i<s.length; i++) {
            System.out.print(s[i] + " ");
        }

        return 0;

    }

    public static void main(String[] args) {
        
        String [] s = {"Ritesh", "Ajeet", "Shubham", "Sunny", "Sumit", "Rauvin", "Manish", "Satyam", "Raja", "Gajendra", "Kamran", "Ashish", "Akshay", "Samir", "Vishal"};
        stringSort(s);

    }
}*/

/*class java {

    static void minEle(int[] a) {
        int ct = a[0];
        for (int i=0; i<a.length; i++) {
            if (a[i] < ct) 
                ct = a[i];
        }
        System.out.println("Minimum Element: " + ct);
    }

    static void maxEle(int[] a) {
        int ct = a[0];
        for (int i=0; i<a.length; i++) {
            if(a[i] > ct)
                ct = a[i];
        }
        System.out.println("Maximun Element: " + ct);
    }

    public static void main(String[] args) {
        int [] a = { 40, 20, 50, 60, 10, 70, 30, 90, 80};
        minEle(a);
        maxEle(a);
    }
}*/


/*class duplicateElement {
    static void findDuplicate(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
           }
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 20, 30, 50, 60, 70, 80, 60};
        findDuplicate(arr);
    }
}*/


/*class duplicateElement1 {
    static void findDuplicate(int[] a) {
        sortElement(a);
        for (int i=0; i<a.length-1; i++) {
            if (a[i] == a[i+1])
                System.out.println(a[i]);
        }
    }
    static void sortElement(int[] a) {
        int temp;
        for (int i=0; i<a.length; i++) {
            
            boolean b = false;
            for (int j=0; j<a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    b = true;
                }
            }
            if (b == false)
                break;
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 20, 30, 50, 60, 70, 80, 60};
        findDuplicate(arr);
    }
}*/
// import java.lang.*;
// class evenOdd {
//     static void checkEven(int[] a) {
//         int even=0;
//         for (int i=0; i<a.length; i++) {
//             if (a[i] % 2 == 0) {
//                 even++;
//                 System.out.print(a[i] + " ");
//             }        
            
//         }
//         System.out.println("\nTotal no. of even: " + even);
//         System.out.println("\n"); 
//     }
    
    

//     static void checkOdd(int[] a) {
//         int odd=0;
//         for (int i=0; i<a.length; i++) {
//             if (a[i] % 2 != 0) {
//                 odd++;
//                 System.out.print(a[i] + " ");
//             }        
            
//         }
//         System.out.print("\nTotal no. of odd: " + odd);
//     }
    
//     public static void main(String[] args) {
//         int [] arr = {10, 32, 3, 5, 6, 1, 9, 7, 15, 73, 38, 54, 36, 73};
//         checkEven(arr);
//         checkOdd(arr);
//     }
// }

/*class array {
    static void evenOddDisplay(int[] a) {
        int evenCount=0, oddCount=0;

        for (int i=0; i<a.length; i++) {
            if (a[i] % 2 == 0) 
                evenCount++;
            else
                oddCount++;
        }
        System.out.print(evenCount);
        System.out.print(oddCount);
        int [] evenArray = new int[evenCount];
        int [] oddArray = new int[oddCount];
        int evenIndex=0, oddIndex=0;

        for (int i=0; i<a.length; i++) {
            if (a[i] % 2 == 0) {
                evenArray[evenIndex] = a[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = a[i];
                oddIndex++;
            }
        }
        System.out.println("Total Even no: ");
        for (int i=0; i<evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.println("\nTotal Odd no: ");
        for (int i=0; i<oddCount; i++) {
            System.out.print(oddArray[i] + " ");    
        }
    }


    public static void main(String[] args) {
        int [] arr = {10, 21, 30, 43, 50, 67, 70, 89, 90};
        evenOddDisplay(arr);
    }
}*/

/*class array {
    static void insertion(int[] a, int b, int pos) {
        for (int i=a.length-1; i>pos-1; i--) {
            a[i] = a[i-1];
        }
        a[pos-1] = b;
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int pos = 3;
        int newElement = 25;
        insertion(arr, newElement, pos);
    }
}*/
/*
class array {
    static void insertion(int[] a, int b, int pos) {
        int[] newArray = new int[a.length+1];

        for (int i=0; i<a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i=newArray.length-1; i>pos-1; i--) {
            newArray[i] = newArray[i-1];
        }
        newArray[pos-1] = b;
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i=0; i<newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int pos = 3;
        int newElement = 25;
        insertion(arr, newElement, pos);
    }
}*/