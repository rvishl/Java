import java.util.Scanner;
class Bubble {
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

    public static void sortBubble(int [] array, int n) {
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(array[i] > array[j])
                    swap(array, i, j);
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        inputArray(array, n);
        sortBubble(array, n);
        printArray(array, n);
    }
}