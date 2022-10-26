import java.util.Scanner;
class reverseArray {
    public static Scanner sc = new Scanner(System.in);
    
    static void input(int [] array, int size) {
        System.out.println("Enter value in Array: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("\n");
    }

    static void printArray(int[] array, int size) {
        System.out.println("Print array element: ");
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    static void reverseArrayElement(int[] array, int size) {
        int [] copyArray = new int[size];

        for(int i=size-1, j=0; i>=0; i--, j++) {
            copyArray[j] = array[i];
        }

        for(int i=0; i<size; i++) {
            array[i] = copyArray[i];
        }

    }

    public static void main(String[] args) {
        
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int [] array = new int[size];

        input(array, size);
        printArray(array, size);
        reverseArrayElement(array, size);
        printArray(array, size);
    }
}