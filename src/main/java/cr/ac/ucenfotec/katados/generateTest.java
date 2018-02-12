package cr.ac.ucenfotec.katados;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class generateTest {

	@Test
	public void test() {
		Generator test= new Generator();
		
		ArrayList<Integer> output= test.generate(4620);
		assertEquals(2,(int)output.get(0));
		assertEquals(2,(int)output.get(1));
		assertEquals(3,(int)output.get(2));
		assertEquals(5,(int)output.get(3));
		assertEquals(7,(int)output.get(4));
		assertEquals(11,(int)output.get(5));
	}

}
