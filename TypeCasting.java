public class TypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;
        int number = 25;
        double convertedDouble = number;
        System.out.println("Original double value: " + myDouble);
        System.out.println("After casting to int: " + myInt);
        System.out.println("Original int value: " + number);
        System.out.println("After casting to double: " + convertedDouble);
    }
}
