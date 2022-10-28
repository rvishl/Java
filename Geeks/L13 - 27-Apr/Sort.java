import java.util.Scanner;
import java.util.Arrays;
class Sort {
    public static Scanner sc = new Scanner(System.in);

    static void input(int[] array, int size) {
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
    }

    static void printArray(int[] array, int size) {
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void sorting(int[] array, int size) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        input(array, size);
        printArray(array, size);
        sorting(array, size);
        printArray(array, size);
    }
}