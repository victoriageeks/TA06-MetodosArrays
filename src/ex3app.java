import javax.swing.JOptionPane;
public class ex3app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo sino false. Un número primo es aquel que solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que es divisible entre 5, sin embargo, 17 si es primo.*/
		
		String numUsuario = JOptionPane.showInputDialog("Introduce un número:");
		int num = Integer.parseInt(numUsuario);
		
		if (numeroPrimo(num)) {
			System.out.println("El número introducido es primo.");
		}else {
			System.out.println("El número introducido no es primo");
		}

	}
	
	public static boolean numeroPrimo (int num) {
		if (num<2) {
			return false;
		} else {
			for (int i=2;i<num/2;i++) {
				if (num%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}
