package cr.ac.ucenfotec.katados;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void test1() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("");
		assertEquals(0,resul);	
	}

}
