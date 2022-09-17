class index {
    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int p=i; p<n-1; p++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        for (int i=0; i<n; i++) {
            for (int p=0; p<=i; p++) {
                System.out.print(" ");
            }
            for (int j=i; j<n-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}