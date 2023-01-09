import java.util.Scanner;
class insertionSort {
    public static Scanner sc = new Scanner(System.in);

    public static void input(int[] array, int n) {
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void swap(int[] array, int i, int j) {
        array[j] = ((array[i]+array[j]) - (array[i]=array[j]));
    }

    public static void sortUsingInsertion(int[] array, int n) {
        for(int i=1; i<n; i++) {
            for(int j=i-1; j>=0; j--) {
                if(array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        input(array, n);
        printArray(array, n);
        sortUsingInsertion(array, n);
        printArray(array, n);
    }
}