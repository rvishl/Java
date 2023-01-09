import java.util.Scanner;
class selectionSort {
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

    public static void sortUsingSelection(int[] array, int n) {
        for(int i=n-1; i>=0; i--) {
            int idx=i;
            for(int j=0; j<=i; j++) {
                if(array[j] > array[idx])
                    idx = j;
            }
            swap(array, i, idx);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        input(array, n);
        printArray(array, n);
        sortUsingSelection(array, n);
        printArray(array, n);
    }
}