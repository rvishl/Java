import java.util.*;
class check {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int l, b;
        System.out.println("Enter length: ");
        l = s.nextInt();
        System.out.println("Enter breath: ");
        b = s.nextInt();

        if(l == b) {
            System.out.println("it is square");
        } else {
            System.out.println("It is rectangle");
        }
    }
}