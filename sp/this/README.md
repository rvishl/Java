## Ex:

## Use of 'this' keyword
- `this` keyword can be used to refer current class instance variable.
- `this` keyword can be used to invoke current class method (implicitly).
- `this()` can be used to invoke current class constructor.
- `this` can be used to pass as an argument in the method call.
- `this` can be used to pass as an argument in the constructor call.
- `this` can be used to return the current class instance from the method.

- 1:
class test {
    int i;
    void setValues(int i) {
        this.i = i;
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

- 2:
class Main {
    void display() {
        System.out.println("hello");
    }
    void show() {
        this.display();
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.show();
    }
}

- 3:
class Main {
    Main() {
        this(10);
        System.out.println("Non-parametrized constructor");
    }

    Main(int i) {
        System.out.println("Parametrized constructor");
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}

class Main {
    Main() {
        System.out.println("Non-parametrized constructor");
    }
    Main(int i) {
        this();
        System.out.println("Parametrized constructor");
    }
    public static void main(String[] args) {
        Main m = new Main(10);
    }
}

- 4: 
class Main {
    void m1(Main mm) {
        System.out.println("hey!!);
    }
    void m2() {
        m1(this);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.m2();
    }
}

12:00