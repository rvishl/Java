import java.util.Scanner;
class Selection {
    public static Scanner sc = new Scanner(System.in);

    public static void inputArray(int [] array, int n) {
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }        
    }

    public static void printArray(int [] array, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j) {
        array[j] = ((array[i]+array[j]) - (array[i]=array[j]));
    }

    public static void sortSelection(int [] array, int n) {
        for(int i=n-1; i>=0; i--) {
            int idx=0;
            for(int j=1; j<=i; j++) {
                if(array[idx] < array[j])
                    idx = j;
            }
            swap(array, idx, i);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        inputArray(array, n);
        sortSelection(array, n);
        printArray(array, n);
    }
}