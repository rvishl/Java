import java.util.Scanner;
class practice {
    public static Scanner sc = new Scanner(System.in);

    public static void input(int[] array, int size) {
        System.out.println("Enter value in an Array: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
    }

    // public static void swap(int[] array, int start, int end) {
    //      array[end] = ((array[start]+array[end]) - (array[start]=array[end]));
    // }

    public static void reverseArray(int[] array, int size) {
        for(int i=0; i<size/2; i++) {
            // swap(array, i, size-1-i);   
            int end = size-1-i;
            array[end] = ((array[i]+array[end]) - (array[i]=array[end]));         
        }
    }

    public static void printArray(int[] array, int size) {
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        input(array, size);
        reverseArray(array, size);
        printArray(array, size);
    }
}