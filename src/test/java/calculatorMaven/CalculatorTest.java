package calculatorMaven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import calculatorMaven.Calculator;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator calc = new Calculator(2, 4);
		double result = calc.sum();
		assertEquals(6, result, "La somma deve essere 6");
	}
	
	@Test
	void testSubtraction() {
		Calculator calc = new Calculator(2, 4);
		double result = calc.subtraction();
		assertEquals(-2, result, "La sottrazione deve essere -2");
	}
	
	@Test
	void testMultiplication() {
		Calculator calc = new Calculator(2, 4);
		double result = calc.multiplication();
		assertEquals(8, result, "La moltiplicazione deve essere 8");
	}

	@Test
	void testDivision() {
		Calculator calc = new Calculator(2, 4);
		double result = calc.division();
		assertEquals(0.5, result, "La divisione deve essere 0,5");
	}

}
