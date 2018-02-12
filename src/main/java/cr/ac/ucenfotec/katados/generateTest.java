package cr.ac.ucenfotec.katados;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class generateTest {

	@Test
	public void test1() {
		Generator test = new Generator();

		int[] output = test.generate(1);
		int[] testValue = {};
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test2() {
		Generator test = new Generator();

		int[] output = test.generate(2);
		int[] testValue = { 2 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test3() {
		Generator test = new Generator();

		int[] output = test.generate(3);
		int[] testValue = { 3 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test4() {
		Generator test = new Generator();

		int[] output = test.generate(4);
		int[] testValue = { 2, 2 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test5() {
		Generator test = new Generator();

		int[] output = test.generate(5);
		int[] testValue = { 5 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test6() {
		Generator test = new Generator();

		int[] output = test.generate(6);
		int[] testValue = { 2, 3 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test7() {
		Generator test = new Generator();

		int[] output = test.generate(7);
		int[] testValue = { 7 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test8() {
		Generator test = new Generator();

		int[] output = test.generate(8);
		int[] testValue = { 2, 2, 2 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test9() {
		Generator test = new Generator();

		int[] output = test.generate(9);
		int[] testValue = { 3, 3 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test10() {
		Generator test = new Generator();

		int[] output = test.generate(36);
		int[] testValue = { 2, 2, 3, 3 };

		for (int num : output) {
			System.out.println(num);
		}

		assertArrayEquals(testValue, output);
	}

	@Test
	public void test11() {
		Generator test = new Generator();

		int[] output = test.generate(42);
		int[] testValue = { 2, 3, 7 };
		assertArrayEquals(testValue, output);
	}

	@Test
	public void test12() {
		Generator test = new Generator();

		int[] output = test.generate(4620);
		int[] testValue = { 2, 2, 3, 5, 7, 11 };
		assertArrayEquals(testValue, output);
	}
}
