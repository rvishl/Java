import java.util.Scanner;
class SelectionSort {
    public static Scanner sc = new Scanner(System.in);

    static void input(int[] array, int size) {
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println();
    }

    static void printArray(int[] array, int size) {
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    static void swap(int[] array, int i, int j) {
        array[j] = ((array[i]+array[j] - (array[i]=array[j])));
    }

    static void selectionSort(int[] array, int size) {
        for(int i=size-1; i>0; i--) {
            int idx=0;
            for(int j=0; j<=i; j++) {
                if(array[j] > array[idx]) {
                    idx = j;
                }
            }
            swap(array, i, idx);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        input(array, size);
        System.out.println("Array before sorting:");
        printArray(array, size);
        selectionSort(array, size);
        System.out.println("Array after sorting:");
        printArray(array, size);
    }
}