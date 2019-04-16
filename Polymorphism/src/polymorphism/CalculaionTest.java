package polymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaionTest {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		double result= calculator.add(3.00,10.50);
		int result2=calculator.add(20, 10,5);
		assertEquals(13.5,result,.0000);
		assertEquals(35,result2);
	}

}
