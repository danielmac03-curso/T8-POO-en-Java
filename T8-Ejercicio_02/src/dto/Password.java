package dto;

public class Password {
	
	private int longitud;
	private String contraseņa;
	
	public Password(){
		this.longitud = 8;
		this.contraseņa = generarContraseņa(8);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseņa = generarContraseņa(longitud);
	}
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseņa=" + contraseņa + "]";
	}

	public static String generarContraseņa(int longitud){
		//https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
		
		String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" +  "0123456789";
		 
		StringBuilder contraseņa = new StringBuilder(longitud); 
		  
        for (int i = 0; i < longitud; i++) { 
            int index = (int)(letrasNumeros.length() * Math.random()); 
            contraseņa.append(letrasNumeros.charAt(index)); 
        } 
  
        return contraseņa.toString(); 
	}

}
