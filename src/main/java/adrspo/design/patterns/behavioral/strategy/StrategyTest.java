package adrspo.design.patterns.behavioral.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(new SumOperation());

		int a = 10;
		int b = 25;
		
		System.out.println("Sum: " + calculator.executeOperation(a, b));
		
		calculator.setOperation(new SubtractOperation());
		System.out.println("Difference: " + calculator.executeOperation(a, b));
		
		calculator.setOperation(new MultiplyOperation());
		System.out.println("Product: " + calculator.executeOperation(a, b));
	}

}
