package cr.ac.ucenfotec.katados;

import java.util.ArrayList;

class Generator {
	public int[] generate(int n) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int[] resul;

		while (n % 2 == 0) {
			numeros.add(2);
			n /= 2;
		}
		
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				numeros.add(i);
				n /= i;
			}
		}

		if (n > 2) {
			numeros.add(n);
		}

		resul = new int[numeros.size()];

		for (int i = 0; i < numeros.size(); i++) {
			resul[i] = numeros.get(i);
		}

		return resul;
	}

}
