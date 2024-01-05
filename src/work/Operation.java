package work;

public enum Operation {
	ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION;

	public static int calculate(int num1, int num2, Operation operation) {
		switch (operation) {
		case ADDITION:
			return num1 + num2;
		case SUBTRACTION:
			return num1 - num2;
		case MULTIPLICATION:
			return num1 * num2;
		case DIVISION:
			if (num2 != 0) {
				return num1 / num2;
			} else {
				System.out.println("Division by zero is not allowed!");
				return Integer.MIN_VALUE;  
			}
		default:
			System.out.println("Invalid operation");
			return Integer.MIN_VALUE; 
		}
	}
}
