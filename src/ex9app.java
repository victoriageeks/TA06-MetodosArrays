import javax.swing.JOptionPane;
import java.util.Random;
public class ex9app {

	public static void main(String[] args) {
		/*Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aeatorios entre el 0 y el 9. Al final muestra por pantalla el valor de cada posición y la suma de todos los valores.*/
		
		/*Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar) y otro para mostrar el contenido y la suma del array.*/
		
		String tamaño = JOptionPane.showInputDialog("Introduce el tamaño del array:");
		int num[] = new int [Integer.parseInt(tamaño)];
		
		arrayNumAleatorios(num, 0, 9);
		mostrarArray(num);

	}
	
	public static void arrayNumAleatorios (int num[],int a, int b) {
		Random rand = new Random();
		for (int i=0;i<num.length;i++) {
			num[i]= rand.nextInt(b-a+1) + a;
		}
	}
	
	public static void mostrarArray(int num[]) {
		for (int i=0; i<num.length;i++) {
			JOptionPane.showMessageDialog(null, "El índice "+i+" tiene el valor de "+num[i]);
		}
	}

}
