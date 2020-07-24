package com.dypiemr.TDD_;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAfrm1st2charTest {
/*TODO List
 * 1. 2 char AA=>Null,AB=>B
 * 2. 3 char ABC=>BC,AAC=>C
 * 3. 4char ABCD =>BCD,AABC=>BC
 * 4. 5 char BCDSA=>BCDSA
 */
	RemoveAFrm1st2char obj;
	@BeforeEach
    public void setup()
    {
    	obj=new RemoveAFrm1st2char(); 
    }
	@Test
	void test2char() {
		assertEquals("",obj.remove("AA"));
	}
	
	@Test
	void test3char() {
		assertEquals("B",obj.remove("AAB"));
	}
	@Test
	void test4char() {
		assertEquals("BAC",obj.remove("ABAC"));
	}
	@Test
	void test5char() {
		assertEquals("BCDAS",obj.remove("BCDAS"));
	}
}
