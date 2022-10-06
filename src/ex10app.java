import java.util.Random;

import javax.swing.JOptionPane;
public class ex10app {

	public static void main(String[] args) {
		/*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, por último nos indicará cuál es el mayor de todos.
		 * 
		 * Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos los métodos que necesites. */
		
		String tamaño = JOptionPane.showInputDialog("Introduce el tamaño del array:");
		int num[] = new int [Integer.parseInt(tamaño)];
		
		rellenarNumPrimoAleatorio(num,1,100);
		mostrarArray(num);
		
		int numMayor = numMayor(num);
		JOptionPane.showMessageDialog(null, "El número primo más grande es el "+numMayor);

	}
	
	public static void rellenarNumPrimoAleatorio (int num[], int a, int b) {
		Random rand = new Random();
		//revisar esto porque no acaba de funcionar
		int i=0;
		
		while (i<num.length) {
			int numeroAleatorio=rand.nextInt((b-a)+1) + a;
			if (numPrimo(numeroAleatorio)) {
				num[i] = numeroAleatorio;
				i++;
			}
		}
	}
	
	public static boolean numPrimo (int num) {
		if (num<2) {
			return false;
		}else {
			for (int i=2;i<=num/2;i++) {
				if (num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void mostrarArray (int num[]) {
		for (int i=0; i<num.length;i++) {
			JOptionPane.showMessageDialog(null, "El índice "+i+" tiene el valor de "+num[i]);
		}
	}
	
	public static int numMayor (int num[]) {
		int mayor = 0;
		for (int i=0;i<num.length;i++) {
			if (num[i]>mayor) {
				mayor = num[i];
			}
		}
		return mayor;
	}
	

}
