import java.util.Scanner;
class occurence {
    public static Scanner sc = new Scanner(System.in);

    static void input(int[] array, int size) {
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
    }

    static void maxOccurence(int [] array, int size, int value) {
        System.out.print("Maximum occurence of " + value + " = ");
        int count=0;
        for(int i=0; i<size; i++) {
            if(array[i] == value) {
                count++;
            }
        }
        System.out.print(count + " times");
    }

    public static void main(String[] args) {
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        int [] array = new int[size];

        input(array, size);

        System.out.println("Enter value to search: ");
        int value = sc.nextInt();

        maxOccurence(array, size, value);
    }
}