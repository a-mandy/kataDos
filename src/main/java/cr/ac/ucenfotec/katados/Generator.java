package cr.ac.ucenfotec.katados;

import java.util.ArrayList;

public class Generator {
	public ArrayList<Integer> generate(int n) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		while (n % 2 == 0) {
			numeros.add(2);
			n /= 2;
		}
		
		for(int i = 3; i < Math.sqrt(n);i+=2) {
			while(n%i == 0) {
				numeros.add(i);
				n /= i;
			}
		}
		
		if(n > 2) {
			numeros.add(n);
		}

		return numeros;
	}

}
