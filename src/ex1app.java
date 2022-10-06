import javax.swing.JOptionPane;
public class ex1app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos calcule el área de un círculo, cuadrado o triángulo. Pediremos que figura queremos calcular su área y según lo itroducido pedirá los valores necesarios para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla.*/
		
		String figura = JOptionPane.showInputDialog("Introduce una figura para calcular su área:");
		figura.toLowerCase();
		
		switch (figura) {
			case "circulo":
				String radioUsuario = JOptionPane.showInputDialog("Introduce el radio del círculo: ");
				double radio = Double.parseDouble(radioUsuario);
				
				double resultadoCirculo=areaCirculo(radio);
				JOptionPane.showMessageDialog(null, "El área del círculo es: "+resultadoCirculo);
			break;
			
			case "triangulo":
				String baseUsuario = JOptionPane.showInputDialog("Introduce la base del triángulo: ");
				double base = Double.parseDouble(baseUsuario);
				String alturaUsuario = JOptionPane.showInputDialog("Introduce la altura del triángulo: ");
				double altura = Double.parseDouble(alturaUsuario);
				
				double resultadoTriangulo = areaTriangulo(base,altura);
				JOptionPane.showMessageDialog(null, "El área del triángulo es: "+resultadoTriangulo);
			break;
			
			case "cuadrado":
				String ladoUsuario1 = JOptionPane.showInputDialog("Introduce el primer lado del cuadrado: ");
				double lado1 = Double.parseDouble(ladoUsuario1);
				String ladoUsuario2 = JOptionPane.showInputDialog("Introduce el segundo lado del cuadrado: ");
				double lado2 = Double.parseDouble(ladoUsuario2);
				
				double resultadoCuadrado = areaCuadrado(lado1,lado2);
				JOptionPane.showMessageDialog(null, "El área del cuadrado es: "+resultadoCuadrado);
			break;
		}
	}
	
	public static double areaCirculo (double radio) {
		final double PI = 3.14;
		double resultado = PI*(Math.pow(radio, 2));
		return resultado;
	}
	
	public static double areaTriangulo ( double base, double altura) {
		double resultado = (base * altura) / 2;
		return resultado;
	}
	
	public static double areaCuadrado (double lado1, double lado2) {
		double resultado = (lado1*lado2);
		return resultado;
	}


}
