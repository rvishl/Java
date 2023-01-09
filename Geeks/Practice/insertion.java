import java.util.Scanner;
class insertion {
    public static Scanner sc = new Scanner(System.in);

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i]+arr[j]) - (arr[i]=arr[j]));
    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String [] args) {
        int[] array = {4, 6, 3, 9, 2, 1, 7, 5, 8};
        printArray(array);
        insertionSort(array);
        printArray(array);
    }
}