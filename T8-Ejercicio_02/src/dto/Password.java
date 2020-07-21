package dto;

public class Password {
	
	private int longitud;
	private String contraseña;
	
	public Password(){
		this.longitud = 8;
		this.contraseña = generarContraseña(8);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	public static String generarContraseña(int longitud){
		//https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
		
		String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" +  "0123456789";
		 
		StringBuilder contraseña = new StringBuilder(longitud); 
		  
        for (int i = 0; i < longitud; i++) { 
            int index = (int)(letrasNumeros.length() * Math.random()); 
            contraseña.append(letrasNumeros.charAt(index)); 
        } 
  
        return contraseña.toString(); 
	}

}
