class practice {
    public static void main(String[] args) {
        // int k=1;
        // for(int i=1; i<=4; i++) {
        //     for(int j=1; j<=4; j++) {
        //         System.out.print(k + " ");
        //         k++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++) {
        //     for(int j=1; j<=4; j++) {
        //         System.out.print((j + (i-1) * 4) + " ");
        //     }
        //     System.out.println();
        // }

        int n=6;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        // for(int i=1; i<n; i++) {
        //     for(int j=n-1; j>=i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for(int i=1; i<n; i++) {
            int p=1;
            for(int j=n-1; j>=i; j--) {
                System.out.print(p);
                p++;
            }
            System.out.print("\n");
        }

    }
}