import java.util.Random;
import javax.swing.JOptionPane;
public class ex2app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado. Crea un método donde paamos como parámetros entre que números queremos que los genere, podemos pedirlas por teclado antes de generar los números. Este método devolverá un número entero aletorio.  Muestra estos números por pantalla. */
		
		String cantidadNumsUsuario = JOptionPane.showInputDialog("Introduce la cantidad de números aleatorios que quieras generar: ");
		int cantidadNums = Integer.parseInt(cantidadNumsUsuario);
		
		String numMaximoUsuario = JOptionPane.showInputDialog("Introduce un valor máximo: ");
		int numMaximo = Integer.parseInt(numMaximoUsuario);
		
		String numMinimoUsuario = JOptionPane.showInputDialog("Introduce un valor mínimo: ");
		int numMinimo = Integer.parseInt(numMinimoUsuario);
		
		System.out.println("Números generados aleatoriamente: ");
		for (int i=0; i<cantidadNums; i++) {
			System.out.print(GenerarNumerosAleatorios(numMinimo, numMaximo)+" ");
		}
	}
	
	
	public static int GenerarNumerosAleatorios (int num1, int num2) {
		Random rand = new Random();
		int resultado = rand.nextInt(num2-num1+1) + num1;
		return resultado;
	}

}
