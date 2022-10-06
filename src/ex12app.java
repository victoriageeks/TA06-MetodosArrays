import java.util.Random;

import javax.swing.JOptionPane;

public class ex12app {

	public static void main(String[] args) {
		/*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre el 1 y el 300 y mostrará aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar que se introduce un número correcto), estos deben guardarse en un nuevo array.*/
		
		String tamaño = JOptionPane.showInputDialog("Introduce un tamaño");
		int num[] = new int [Integer.parseInt(tamaño)];
		
		String ultimoNumUsuario = JOptionPane.showInputDialog("Introduce un número entre el 0 y el 9");
		int ultimoNum=Integer.parseInt(ultimoNumUsuario);
		
		for (int i=0; i<num.length;i++) {
			if(ultimoNum>=0 && ultimoNum<=9) {
				numAleatorios(num,1,300);
				
				int nuevoArray[]=numTerminado(num, ultimoNum);
				
				mostrarArray(nuevoArray);
			}
		}

	}
	
	public static void numAleatorios (int num[],int a, int b) {
		Random rand = new Random();
		for (int i=0;i<num.length;i++) {
			num[i]= rand.nextInt(b-a+1) + a;
		}
	}
	
	public static void mostrarArray(int num[]) {
		for (int i=0; i<num.length;i++) {
			if (num[i]!=0) {
				JOptionPane.showMessageDialog(null, "El numero "+num[i]+" termina con el dígito que le hemos indicado.");
			}
		}
	}
	
	public static int[] numTerminado (int num[], int ultimoNum) {
		int nuevoArray[]= new int[num.length];
		int numFinal=0;
		for (int i=0; i<nuevoArray.length;i++) {
			numFinal=num[i]-(num[i]/10*10);
			
			if (numFinal==ultimoNum) {
				nuevoArray[i]=num[i];
			}
		}
		return nuevoArray;
	}

}
