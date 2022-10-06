import javax.swing.JOptionPane;
public class ex8app {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el índice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
		
		int num[] = new int [10];
		
		rellenarArray(num);
		mostrarArray(num);
	}

	public static void rellenarArray (int num[]) {
		for (int i=0; i<num.length;i++) {
			String numUsuario = JOptionPane.showInputDialog("Introduce un número:");
			num[i]=Integer.parseInt(numUsuario);
		}
	}
	
	public static void mostrarArray (int num[]) {
		for (int i=0; i<num.length;i++) {
			JOptionPane.showMessageDialog(null, "El índice "+i+" tiene el valor de "+num[i]);
		}
	}
}
