import java.util.Random;


import javax.swing.JOptionPane;

public class ex11app {

	public static void main(String[] args) {
		/*Crea 2 arrays de números con la dimensión pasada por teclado. Uno de ellos estará rellenando con números aleatorios y el otro apuntará al array anterior, reasigna los valores del segundo array con valores aleatorios.
		 * 
		 * Después, crea un método que tenga como parámetros, los 2 arrays y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.*/

		//hacer clone en ves de reasignar
		String tamañoUsuario = JOptionPane.showInputDialog("Introduce un tamaño:");
		int tamaño = Integer.parseInt(tamañoUsuario);
		
		int array1[] = new int [tamaño];
		int array2[];
		
		rellenarNumerosAleatorios(array1, 1, 30);
		array2=array1;
		
		array1 = new int[tamaño];
		rellenarNumerosAleatorios(array1, 1, 20);
		
		int array3[] = multiplicador(array1,array2);
		
		System.out.println("Array 1:");
		mostrarArray(array1);
		System.out.println("Array 2:");
		mostrarArray(array2);
		System.out.println("Array 3:");
		mostrarArray(array3);
	}
	
	public static void rellenarNumerosAleatorios (int num[], int a, int b) {
		for (int i=0; i<num.length;i++) {
			Random rand = new Random();
			num[i]=rand.nextInt((b-a)+1) + a;
		}
	}
	
	public static void mostrarArray (int num[]) {
		for (int i=0; i<num.length;i++) {
			JOptionPane.showMessageDialog(null, "El índice "+i+" tiene el valor de "+num[i]);
		}
	}
	
	public static int[] multiplicador (int array1[], int array2[]) {
		int array3[] = new int [array1.length];
		for (int i=0; i<array1.length;i++) {
			array3[i]=array1[i]*array2[i];
		}
		return array3;
	}
	
	

}
