package com.sonata.JUnitExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Addition {
	public int add(int a , int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		int c = a1.add(10, 20);
		System.out.println(c);

	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
