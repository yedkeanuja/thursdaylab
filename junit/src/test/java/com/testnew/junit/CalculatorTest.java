package com.testnew.junit;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator cal;

	
	@BeforeAll
	static void beforeAllinit()
	{
		System.out.println("Before All: This will execute before all test cases.");
	}
	
	@AfterAll
	static void afterAllinit()
	{
		System.out.println("After All: This will execute after all test cases.");
	}
	
	//before each is used to execute before every method
	@BeforeEach
	void init()
	{
		cal = new Calculator();
	}
	
	//after each is used to execute after every method
	@AfterEach
	void cleanUp()
	{
		cal = null; //null referencing
		System.out.println("Clean up....");
	}
	
	@Test
	void testAddition()
	{
//		Calculator cal = new Calculator();
		assertEquals(100.5, cal.addition(75.25, 25.25));
	}
	
	@Test
	@DisplayName("testing Substraction Method")
	void testSubstraction()
	{
		//Calculator cal = new Calculator();
		assertEquals(10, cal.substraction(30, 20));
	}
	@Test
	@DisplayName("testing multiplication  Method")
	void testMultiply()
	{
		//assertEquals(12,cal.multiplication(4,3));
		assertAll(
				()->assertEquals(12,cal.multiplication(4,3)),
				()->assertEquals(64,cal.multiplication(8,8)),
				()->assertEquals(-3,cal.multiplication(3,-1)),
				()->assertEquals(10,cal.addition(5,5))
				);
						
	}
	@Test
	@DisplayName("testing factorial Method")
	void factorial()
	{
		assertEquals(24, cal.factorial(4));
	}
	@Test
	@DisplayName("testing division Method")
	void division()
	{
		assertEquals(8, cal.division(40,5));
	}
	@Test
	void divisionwithexception()
	{
		assertThrows(ArithmeticException.class,()->cal.division(40, 0));
	}
	//@Test
	@RepeatedTest(3)
	@DisplayName("testing to find max number ")
	void testFindMax()
	{
		System.out.println("Repeated test");
		int arr[]= {23,56,77,90,12};
		assertEquals(90,cal.findMax(arr));
	}
}