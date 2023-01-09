import java.util.Scanner;
class index {
    public static Scanner sc = new Scanner(System.in);

    public static void swap(int[] array, int i, int j) {
        array[j] = ((array[i]+array[j]) - (array[i]=array[j]));
    }

    // public static void selectionSort(int [] array) {
    //     for(int i=array.length-1; i>=0; i--) {
    //         int idx=i;
    //         for (int j=0; j<=i; j++) {
    //             if (array[idx] < array[j])
    //                 idx = j;
    //         }
    //         swap(array, i, idx);
    //     }
    // }

    public static void selectionSort(int [] array) {
        for(int i=0; i<array.length-1; i++) {
            int idx=i;
            for (int j=i+1; j<array.length; j++) {
                if (array[idx] > array[j])
                    idx = j;
            }
            swap(array, i, idx);
        }
    }


    public static void bubbleSort(int [] array) {
        for(int i=0; i<array.length-1; i++) {        
            for (int j=i+1; j<array.length; j++) {
                if (array[i] > array[j])
                    swap(array, i, j);                    
            }
        }
    }

    public static void insertionSort(int [] array) {
        
    }


    public static void printArray(int [] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] array = {3, 5, 2, 8, 10, 1, 7, 4, 6};
        selectionSort(array);
        printArray(array);
        bubbleSort(array);
        printArray(array);
        // insertionSort(array);
        // printArray(array);
    }
}