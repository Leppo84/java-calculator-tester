package calculatorMaven;

public class Calculator {
	private double num1;
	private double num2;
//	private float result;

	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double sum() {
		return num1 + num2;	
	}


	public double subtraction() {
		return num1 - num2;	
	}

	public double multiplication() {
		return num1 * num2;	
	}

	public double division() {
		return num1 / num2;	
	}

}
