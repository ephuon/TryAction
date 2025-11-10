package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 114514);
		assertEquals(114515, result);
	}

}
