import java.util.Scanner;
class Pairs {
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
        System.out.print("\n");
    }

    static void findPairs(int[] array, int size, int value) {
        for(int i=0; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                if((array[i] + array[j]) == value) {
                    // System.out.println(" [" + i + ", " + j + "]"); // print index value
                    System.out.println(" [" + array[i] + ", " + array[j] + "]"); // print value
                }
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        input(array, size);

        System.out.print("Enter value for find pairs: ");
        int value = sc.nextInt();

        printArray(array, size);
        findPairs(array, size, value);
        printArray(array, size);
    }
}