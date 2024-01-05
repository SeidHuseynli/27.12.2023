package work;

public class Main {

	public static void main(String[] args) {

				int num1 = 3;
				int num2 = 5;
				Operation operation = Operation.ADDITION;

				int result = Operation.calculate(num1, num2, operation);
				System.out.println("Result: " + result);
			}
		

}


