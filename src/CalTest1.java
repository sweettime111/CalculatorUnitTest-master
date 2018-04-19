import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest1 {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(60,20),80);
	}
	
	@Test
	public void testMinus() {
		Calculator cal = new Calculator();
		assertEquals(cal.minus(70,30),10);
	
	}
	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(80,40),300);
	}

}
