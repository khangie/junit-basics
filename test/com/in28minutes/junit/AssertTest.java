package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(1,1);
		assertTrue(true);
		assertFalse(false);
		assertNotNull("Test");
		assertNull(null);
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}

}
