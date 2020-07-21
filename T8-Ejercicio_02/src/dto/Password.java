package dto;

public class Password {
	
	private int longitud;
	private String contrase�a;
	
	public Password(){
		this.longitud = 8;
		this.contrase�a = generarContrase�a(8);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarContrase�a(longitud);
	}
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}

	public static String generarContrase�a(int longitud){
		//https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
		
		String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" +  "0123456789";
		 
		StringBuilder contrase�a = new StringBuilder(longitud); 
		  
        for (int i = 0; i < longitud; i++) { 
            int index = (int)(letrasNumeros.length() * Math.random()); 
            contrase�a.append(letrasNumeros.charAt(index)); 
        } 
  
        return contrase�a.toString(); 
	}

}
