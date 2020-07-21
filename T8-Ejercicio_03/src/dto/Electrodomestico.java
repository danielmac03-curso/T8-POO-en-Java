package dto;

public class Electrodomestico {
	
	final double PRECIO_BASE_DEFAULT = 100;
	final String COLOR_DEFAULT = "BLANCO";
	final char CONSUMO_ENERGETICO_DEFAULT = 'F';
	final double PESO_DEFAULT = 5.0;
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	private boolean datosIntroducidosCorrectamente;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = PESO_DEFAULT;
		this.datosIntroducidosCorrectamente = true;
	}
	
	public Electrodomestico(double precio, double peso) {	
		this.precioBase = precio;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = peso;
		this.datosIntroducidosCorrectamente = true;
	}
	
	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		
		//Color y consumo puesto a mayusculas para evitar tener que comprovar por doble
		color = color.toUpperCase();
		consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		
		//Variable para comprobaciones
		boolean colorCorrecto = false;
		boolean consumoEnergeticoCorrecto = false;
		this.datosIntroducidosCorrectamente = false;
		
		//Si no es un color permitido da un error
		if(color.equals("BLANCO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
			colorCorrecto = true;
		}else {
			System.out.println("Introduce un color valido");
		}
		
		//Si no es un consumo energetico permitido da un error
		if(consumoEnergetico == 'A'|| consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			consumoEnergeticoCorrecto = true;
		}else {
			System.out.println("Introduce un consumo energetico valido");
		}
		
		//Comprueba que el color y el consumo sean correctors
		if(colorCorrecto && consumoEnergeticoCorrecto) {
			this.precioBase = precio;
			this.color = color;
			this.consumoEnergetico = consumoEnergetico;
			this.peso = peso;
			this.datosIntroducidosCorrectamente = true;
		}
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	public boolean isDatosIntroducidosCorrectamente() {
		return datosIntroducidosCorrectamente;
	}

}
