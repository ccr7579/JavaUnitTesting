public class JavaUnitTestExample {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);

        if (result == 5) {
            System.out.println("testAdd passed");
        } else {
            System.out.println("testAdd failed: expected 5 but got " + result);
        }
    }
}