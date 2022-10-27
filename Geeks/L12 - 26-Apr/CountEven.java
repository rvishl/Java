import java.util.Scanner;
class CountEven {
    public static Scanner sc = new Scanner(System.in);

    static void evenPair(int n) {
        int count=0;
        for(int i=1; i<n; i++) {
            for(int j=i+1; j<=n; j++) {
                if((i+j)%2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        evenPair(n);
    }
}