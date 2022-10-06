import javax.swing.JOptionPane;
public class ex4app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos calcule el factorial de un número pedido por tecldo, lo realizará mediante un método al que le pasamos el número como parámetro. Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si introducimos un 5, realizará esta operación 5*4*3*2*1=120.*/

		String numUsuario = JOptionPane.showInputDialog("Introduce un número:");
		int num = Integer.parseInt(numUsuario);
		
		JOptionPane.showMessageDialog(null, "El número factorial de "+num+" es "+numFactorial(num));
	}
	
	public static int numFactorial (int num) {
		int resultado = num;
		for (int i=(num-1);i>0;i--) {
			resultado=resultado*i;
		}
		return resultado;
	}

}
