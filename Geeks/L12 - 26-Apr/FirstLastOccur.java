import java.util.Scanner;
class FirstLastOccur {
    public static Scanner sc = new Scanner(System.in);

    public static void input(int[] array, int size) {
        System.out.println("Enter value in an Array: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
    }

    // public static void firstLast(int[] array, int size, int value) {
    //     //first occurence
    //     int first = -1;
    //     for(int i=0; i<size; i++) {
    //         if(array[i] == value) {
    //             first = i+1;
    //             break;
    //         }
    //     }
    //     System.out.println("first occurence: " + first);

    //     //Last occurence
    //     int last=-1;
    //     for(int i=size-1; i>=0; i--) {
    //         if(array[i] == value) {
    //             last = i+1;
    //             break;
    //         }
    //     }
    //     System.out.print("Last Occurence: " + last);

    // }

    public static void firstLast(int[] array, int size, int value) {
        //first occurence
        int i;
        for(i=0; i<size; i++) {
            if(array[i] == value) {
                break;
            }
        }
        System.out.println("first occurence: " + i);

        //Last occurence
        i=size;
        for(i=size-1; i>=0; i--) {
            if(array[i] == value) {
                break;
            }
        }
        System.out.print("Last Occurence: " + i);

    }

    public static void main(String[] args) {
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int [] array = new int[size];

        input(array, size);

        System.out.println("Enter value: ");
        int value = sc.nextInt();

        firstLast(array, size, value);
    }
}