import dto.Electrodomestico;
import javax.swing.JOptionPane;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico e1;
			
		String precioBase = JOptionPane.showInputDialog("Introduce el precio del producto:");	
		
		String color = JOptionPane.showInputDialog("Introduce el color del producto:");		
		
		//Comprueba que solo a introducido un letra, para a la hora de pasar el char no coja solo el primero introducido por error
		String consumoEnergetico;
		do {
			consumoEnergetico= JOptionPane.showInputDialog("Introduce el consumo energetico del producto:");
		} while (consumoEnergetico.length() > 1);
		
		String peso = JOptionPane.showInputDialog("Introduce el peso del producto");
		
		if(!precioBase.equals("") && !color.equals("") && !consumoEnergetico.equals("") && !peso.equals("")) {
			//Ha introfucido todos los valores
			double precioBaseDouble = Double.parseDouble(precioBase);
			char consumoEnergeticoChar = consumoEnergetico.charAt(0);
			double pesoDouble = Double.parseDouble(peso);
			e1 = new Electrodomestico(precioBaseDouble, color, consumoEnergeticoChar, pesoDouble);
		}else if(!precioBase.equals("") && !peso.equals("")) {
			//Solo ha introducido precio base y peso
			double precioBaseDouble = Double.parseDouble(precioBase);
			double pesoDouble = Double.parseDouble(peso);
			e1 = new Electrodomestico(precioBaseDouble, pesoDouble);
		}else {
			//No ha introducido nada
			e1 = new Electrodomestico();
		}
		
		//Comprueba si hay algun error
		if(e1.isDatosIntroducidosCorrectamente()) {
			System.out.println(e1.toString());
		}

	}

}
