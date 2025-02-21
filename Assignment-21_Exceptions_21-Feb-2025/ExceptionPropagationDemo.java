public class ExceptionPropagationDemo {
    static void method1() {
        System.out.println(10 / 0);
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}