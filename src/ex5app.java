import javax.swing.JOptionPane;
public class ex5app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo realizará un método al que le pasaremos el número como parámetro, devolverá un String con el número convertdo a binario. Para convertir un número decimal a binario, debemos dividir entre 2 el número y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda dividir más, el resto que obtengamos de cada división formará el número binario, de bajo a arriba.*/
		
		//volver a mirármelo porque no acabo de entender la línea 21 y 23.
		
		String numUsuario = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(numUsuario);
		
		String binario = numBinario(num);
		JOptionPane.showMessageDialog(null, "El numero "+num+" en binario es: "+binario);

	}
	
	public static String numBinario (int num) {
		String binario = "";
		String numero;
		
		for (int i = num; i>0; i/=2) {
			// /= significa que i se divide entre 2 y el resultado se guarda en la variable i.
			if(i%2==1) {
				numero="1";
			}else {
				numero="0";
			}
			
			binario = numero + binario;
			
		}
		/*
		 * for (int i = num/2; i>0) {
			// /= significa que i se divide entre 2 y el resultado se guarda en la variable i.
			if(i%2==1) {
				numero="1";
			}else {
				numero="0";
			}
			
			binario = numero + binario;
			i--;
			
		}*/
		return binario;
	}

}
