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

class array {

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
}