# 1

* 
* *
* * *
* * * *
* * * * *
: class index {
    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        pattern(5);
    }
}

# 2
* * * * *
* * * *
* * *
* *
*
: class index1 {
    static void pattern(int n) {
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}

# 3
* 
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
: class index2 {
    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=n-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}

# 4 
    *
   **
  ***
 ****
*****
: class index {
    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            for (int p=0; p<=i; p++) {
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
**Some changing in loop**
class index {
    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int j=3; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}

# 5
*****
 ****
  ***
   **
    *
: class index {
    static void pattern(int n) {
        for (int i=0; i<n; i++) {
            for (int p=0; p<=i; p++) {
                System.out.print(" ");
            }
            for(int j=n; j>i; j--) {
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

# 6 
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
: class index {
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