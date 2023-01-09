import java.util.Scanner;
class bubbleSort {
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

    public static void sortUsingBubble(int[] array, int n) {
        for(int i=0; i<n-1; i++) {
            boolean b=false;
            for(int j=i+1; j<n; j++) {
                if(array[i] > array[j]) {
                    swap(array, i, j);
                    b = true;
                }
            }
            if(b==false)
                break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        input(array, n);
        printArray(array, n);
        sortUsingBubble(array, n);
        printArray(array, n);
    }
}