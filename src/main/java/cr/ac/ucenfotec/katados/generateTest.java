package cr.ac.ucenfotec.katados;

import static org.junit.Assert.*;

import org.junit.Test;

public class generateTest {

	@Test
	public void test() {
		Generator test= new Generator();
		int output= test.generate(2);
		assertEquals(0,output);
	}

}
