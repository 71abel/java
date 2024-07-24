package Myfirst;

public class TypeConversion {
	public static void main(String[] args) {
		int intVar = 10;
        float floatVar = 3.5f;

        // Implicit type conversion
        float result = intVar + floatVar;
        System.out.println("Result: " + result);

        int result1 = (int) (intVar + floatVar);
        System.out.println("Result1: " + result1);

	}

}
