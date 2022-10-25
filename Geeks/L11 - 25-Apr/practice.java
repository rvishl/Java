import java.util.Scanner;
class practice {
    public static Scanner sc = new Scanner(System.in);

    static void printArray(int [] array) {
        System.out.println("\nPrint array!");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void printReverseOrder(int [] array) {
        System.out.println("\nPrint array in reverse order!");
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static void printEvenElement(int [] array) {
        System.out.print("\nPrint Even array!\n");
        for(int i=0; i<array.length; i++) {
            if(array[i]%2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    static void printOddElement(int [] array) {
        System.out.print("\nPrint Odd array!\n");
        for(int i=0; i<array.length; i++) {
            if(array[i]%2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
    
    static void printEvenIndex(int [] array) {
        System.out.print("\nPrint Even index value!\n");
        for(int i=0; i<array.length; i=i+2) {
            System.out.print(array[i] + " ");
        }
    }

    static void printOddIndex(int [] array) {
        System.out.print("\nPrint Odd index value!\n");
        for(int i=1; i<array.length; i+=2) {
            System.out.print(array[i] + " ");
        }
    }

    static void printEvenElementCount(int [] array) {
        System.out.print("\nPrint Even Count element\n");
        int count=0;
        for(int i=0; i<array.length; i++) {
            if(array[i]%2 == 0) {
                count++;
            }            
        }
        System.out.print(count);
    }

    static void printOddElementCount(int [] array) {
        System.out.print("\nPrint Odd Count Element!\n");
        int count=0;
        for(int i=0; i<array.length; i++) {
            if(array[i]%2 != 0) {
                count++;
            }
        }
        System.out.print(count);
    }

    static void printSumOfArrayElement(int [] array) {
        int sum=0;
        System.out.print("\nPrint Sum of Even Array element!\n");
        for(int i=0; i<array.length; i++) {
            sum+=array[i];
        }
        System.out.print(sum);
    }

    static void printSmallestValueOfArray(int [] array) {
        int smallest = array[0];
        System.out.print("\nPrint Smallest Element in Array!\n");
        for(int i=0; i<array.length; i++) {
            // if(smallest > array[i]) {
            //     smallest = array[i];
            // }
            smallest = Math.min(smallest, array[i]);
        }
        System.out.print(smallest);
    }

    static void printLargestValueOfArray(int [] array) {
        int largest = array[0];
        System.out.print("\nPrint Largest Element in Array!\n");
        for(int i=0; i<array.length; i++) {
            // if(largest < array[i]) {
            //     largest = array[i];
            // }
            largest = Math.max(largest, array[i]);
        }
        System.out.print(largest);
    }

    public static void main(String[] args) {
        System.out.print("\nEnter size of an array: ");
        int n = sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter value in an array:");
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        
        printArray(array);
        printReverseOrder(array);
        printEvenElement(array);
        printOddElement(array);
        printEvenIndex(array);
        printOddIndex(array);
        printEvenElementCount(array);
        printOddElementCount(array);
        printSumOfArrayElement(array);
        printSmallestValueOfArray(array);
        printLargestValueOfArray(array);        
    }
}