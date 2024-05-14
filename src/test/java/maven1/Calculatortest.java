package maven1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculatortest {
	@BeforeClass
	public static void setbeforeclass() {
	System.out.println("onetime only");
	}
	
	@Before
	public void setbefore() {
		System.out.println("before every test case");
	}
	
	@Test
	
	public void Testaddition() {
		assertEquals(13,Calculator.addition(8, 5));
	}
	@Test
	public void Testsubstraction() {
		assertEquals(2,Calculator.substraction(5, 3));
		assertEquals(2,Calculator.substraction(-3, -5));
		assertEquals(-2,Calculator.substraction(-5, -3));

	}
	@Test
	
	public void Testmultiplication() {
		assertEquals(20,Calculator.multiplication(5, 4));
		assertEquals(16,Calculator.multiplication(4, 4));
	}
	
	@Test
	public void Testdivision() {
		assertEquals(25,Calculator.division(100, 4));
		
	}
	@After
	public void setafter() {
		System.out.println("after every test case");
		
	}
	
	@AfterClass
	public static void setafterclass() {
		System.out.println("after all test case");
	}

	
}
