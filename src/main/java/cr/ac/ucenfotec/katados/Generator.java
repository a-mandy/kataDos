package cr.ac.ucenfotec.katados;

import java.util.ArrayList;

class Generator {
	public int[] generate(int n) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int[] resul;

		n = porDos(n, numeros);
		
		n = porTres(n, numeros);

		if (n > 2) {
			numeros.add(n);
		}

		resul = toArray(numeros);

		return resul;
	}

	private int[] toArray(ArrayList<Integer> numeros) {
		int[] resul;
		resul = new int[numeros.size()];

		for (int i = 0; i < numeros.size(); i++) {
			resul[i] = numeros.get(i);
		}
		return resul;
	}

	private int porTres(int n, ArrayList<Integer> numeros) {
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				numeros.add(i);
				n /= i;
			}
		}
		return n;
	}

	private int porDos(int n, ArrayList<Integer> numeros) {
		while (n % 2 == 0) {
			numeros.add(2);
			n /= 2;
		}
		return n;
	}

}
