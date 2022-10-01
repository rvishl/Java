## Ex:
class test {
    int i;
    void setValues(int x) {
        i = x;
    }
    void show() {
        System.out.print(i);
    }
    
}

class demo {
    public static void main(String[] args) {
        test t1 = new Test();
        t1.setValues(10);
        t1.show();
    }
}