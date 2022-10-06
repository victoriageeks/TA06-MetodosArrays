import javax.swing.JOptionPane;
public class ex6app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos cuente el número de cifras de un número entero positivo (hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.*/
		
		//preguntar por la línea 22
		
		String numUsuario = JOptionPane.showInputDialog("Introduce un número entero positivo:");
		int num = Integer.parseInt(numUsuario);
		
		int numCifras = contarCifras(num);
		
		if(numCifras==1) {
			JOptionPane.showMessageDialog(null, "El número "+num+" tiene "+numCifras+" cifra.");
		}else {
			JOptionPane.showMessageDialog(null, "El numero "+num+" tiene "+numCifras+" cifras.");
		}
	}
	
	public static int contarCifras (int num) {
		int contador = 0;
		//coste computacional
		for (int i= num;i>0;i/=10) {
			contador++;
		}
		return contador;
	}

}
