public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        int sumInt = example.add(5, 10);
        System.out.println("Sum of two integers (5 + 10): " + sumInt);

        double sumDouble = example.add(5.5, 10.5);
        System.out.println("Sum of two doubles (5.5 + 10.5): " + sumDouble);

        int sumThreeInts = example.add(1, 2, 3);
        System.out.println("Sum of three integers (1 + 2 + 3): " + sumThreeInts);
    }
}
