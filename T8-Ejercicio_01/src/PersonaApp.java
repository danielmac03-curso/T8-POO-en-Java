import javax.swing.JOptionPane;
import dto.Persona;

public class PersonaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre:");
		
		String edad = JOptionPane.showInputDialog("Introduzca la edad:");
		
		String dni = JOptionPane.showInputDialog("Introduzca el DNI:");
		
		String sexo;
		do {
			sexo = JOptionPane.showInputDialog("Introduzca el sexo:");
		} while (sexo.length() > 1);
		
		String peso = JOptionPane.showInputDialog("Introduzca el peso:");
		
		String altura = JOptionPane.showInputDialog("Introduzca la altura:");
		
		Persona p1;
		
		if(!nombre.equals("") && !edad.equals("") && !dni.equals("") && !sexo.equals("") && !peso.equals("") && !altura.equals("")) {
			int edadInt = Integer.parseInt(edad);
			double pesoDouble = Double.parseDouble(peso);
			double alturaDouble = Double.parseDouble(altura);
			char sexoChar = sexo.charAt(0);
			p1 = new Persona(nombre, edadInt, dni, sexoChar, pesoDouble, alturaDouble);
		}else if(!nombre.equals("") && !edad.equals("") && !sexo.equals("")) {
			int edadInt = Integer.parseInt(edad);
			char sexoChar = sexo.charAt(0);
			p1 = new Persona(nombre, edadInt, sexoChar);
		}else {
			p1 = new Persona();
		}
		
		System.out.println(p1.toString());

	}

}
