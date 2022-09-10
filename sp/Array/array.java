/*class array {

    static int sort(int[] a) {

        for (int i=0; i<a.length; i++) {
            
            int temp;
            boolean b = false;

            for (int j=0; j<a.length-1-i; j++) {

                if (a[j] > a[j+1]) {

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    b = true;

                }
            }

            if (b == false) 
                break;

        }
        
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] a = {40, 20, 70, 80, 10, 60, 90, 30, 50};
        sort(a);
    }

}*/

/*class array {

    static int stringSort(String[] s) {

        for (int i=0; i<s.length; i++) {

            String temp;

            for (int j=0; j<s.length-1; j++) {
                if (s[j].compareTo(s[j+1]) > 0) {
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }

            }
            
        }

        for (int i=0; i<s.length; i++) {
            System.out.print(s[i] + " ");
        }

        return 0;

    }

    public static void main(String[] args) {
        
        String [] s = {"Ritesh", "Ajeet", "Shubham", "Sunny", "Sumit", "Rauvin", "Manish", "Satyam", "Raja", "Gajendra", "Kamran", "Ashish", "Akshay", "Samir", "Vishal"};
        stringSort(s);

    }
}*/

class java {

    static void minEle(int[] a) {
        int ct = a[0];
        for (int i=0; i<a.length; i++) {
            if (a[i] < ct) 
                ct = a[i];
        }
        System.out.println("Minimum Element: " + ct);
    }

    static void maxEle(int[] a) {
        int ct = a[0];
        for (int i=0; i<a.length; i++) {
            if(a[i] > ct)
                ct = a[i];
        }
        System.out.println("Maximun Element: " + ct);
    }

    public static void main(String[] args) {
        int [] a = { 40, 20, 50, 60, 10, 70, 30, 90, 80};
        minEle(a);
        maxEle(a);
    }
}