package cr.ac.ucenfotec.katados;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {
	//public ProcesadorRomano pr= new ProcesadorRomano();

	@Test
	public void test1() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("");
		assertEquals(0,resul);	
	}
	
	@Test
	public void test2() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("LX");
		assertEquals(60,resul);	
	}
	@Test
	public void test3() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("XVI");
		assertEquals(16,resul);	
	}
	@Test
	public void test4() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("VIII");
		assertEquals(8,resul);	
	}
	@Test
	public void test5() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("XXI");
		assertEquals(21,resul);	
	}
	@Test
	public void test6() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("CI");
		assertEquals(101,resul);	
	}
	@Test
	public void test7() {
		ProcesadorRomano pr= new ProcesadorRomano();
		int resul;
		resul=pr.convierte("CLXI");
		assertEquals(161,resul);	
	}
	

}
