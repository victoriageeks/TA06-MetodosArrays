import javax.swing.JOptionPane;
public class ex7app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser dólares, yenes o libras. El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que será una cadena, este no devolverá ningún valor, mostrará un mensaje indicando el cambio (void).*/
		String cantidadUsuario = JOptionPane.showInputDialog("Introduce una cantidad en euros:");
		double cantidad = Double.parseDouble(cantidadUsuario);
		
		String monedaUsuario = JOptionPane.showInputDialog("Introduce la moneda a la que quieres convertir:");
		monedaUsuario.toLowerCase();
		
		conversorMoneda(cantidad,monedaUsuario);
		
	}
	
	//por qué void me devuelve? investigar
	public static void conversorMoneda (double cantidad, String moneda) {
		double respuesta = 0;
		boolean correcto = true;
		
		switch (moneda) {
			case "libras":
				respuesta=cantidad*0.86;
			break;
			case "dolares":
				respuesta=cantidad*1.28611;
			break;
			case "yenes":
				respuesta=cantidad*129.852;
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Introduce una moneda válida.");
				correcto = false;
		}
		
		if (correcto) {
			JOptionPane.showMessageDialog(null, cantidad+" euros en "+moneda+" son "+respuesta);
		}
	}

}
