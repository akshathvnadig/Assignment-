package M3;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class driver {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class cat extends driver {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Q4{
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));

        driver a;
        a = new cat();
        a.sound();
    }
}