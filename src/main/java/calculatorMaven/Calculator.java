package calculatorMaven;

public class Calculator {
//	private float num1;
//	private float num2;
//	private float result;

	public float sum( float num1, float num2) {
		return num1 + num2;	
	}

	public float subtraction( float num1, float num2) {
		return num1 - num2;	
	}

	public float multiplication( float num1, float num2) {
		return num1 * num2;	
	}

	public float division( float num1, float num2) throws Exception{
		if (num2 != 0) {
		return num1 / num2;
		}
		else {
			throw new Exception("La divisione per 0 dà infinito");
		}
	}

}
