package test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import source.Calculator;
public class TestCalc {
	static Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void test_BothArePositive() {
		assertTrue(calc.sum(10, 10) > 0);
	}
	@Test
	public void test_BothAreNegative() {
		assertTrue(calc.sum(-10, -10) < 0);
	}
	@Test
	public void test_X_GreaterThan_Y_absolute() {
		assertTrue(calc.sum(20, -10) > 0);
	}
	@Test
	public void test_Y_GreaterThan_X_absolute() {
		assertTrue(calc.sum(10, -20) < 0);
	}
	@Test
	public void test_BothEqualsWithOppositeSigns() {
		assertTrue(calc.sum(10, -10) == 0);
	}
}
