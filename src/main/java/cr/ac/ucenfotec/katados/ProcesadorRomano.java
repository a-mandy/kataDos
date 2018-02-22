package cr.ac.ucenfotec.katados;

//import java.util.ArrayList;

//import org.springframework.boot.SpringApplication;

public class ProcesadorRomano {
	public int convierte(String x) {
		int resul=0;
		if(x=="") {
			resul=0;
		}
		char[] letras = x.toCharArray();
		int tamanio= letras.length;
		int num=0;
		
		for(int i=0;i<tamanio;i++) {
			
			num = toNumber(letras, num, i);
			resul+=num;
		}
		
		return resul;
		
	}

	private int toNumber(char[] letras, int num, int i) {
		switch(letras[i]) {
		case 'I':
			num=1;
			break;
		case 'V':
			num=5;
			break;
		case 'X':
			num=10;
			break;
		case 'L':
			num=50;
			break;
		case 'C':
			num=100;
			break;
		case 'D':
			num=500;
			break;
		case 'M':
			num=1000;
			break;
		}
		return num;
	}

}
