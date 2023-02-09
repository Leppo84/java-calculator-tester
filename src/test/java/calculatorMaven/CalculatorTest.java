package calculatorMaven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import calculatorMaven.Calculator;

class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	void testSum() {
		float result = calc.sum(2,4);
		assertEquals(6, result, "La somma deve essere 6");
	}
	
	@Test
	void testSubtraction() {
		float result = calc.subtraction(2,4);
		assertEquals(-2, result, "La sottrazione deve essere -2");
	}
	
	@Test
	void testMultiplication() {
		float result = calc.multiplication(2,4);
		assertEquals(8, result, "La moltiplicazione deve essere 8");
	}

	@Test
	void testDivision() {
		float result = calc.division(2,4);
		assertEquals(0.5, result, "La divisione deve essere 0,5");
	}

}
