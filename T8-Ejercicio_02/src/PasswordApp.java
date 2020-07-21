import dto.Password;
import javax.swing.JOptionPane;
public class PasswordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero = JOptionPane.showInputDialog("Introduzca la longitud de la contraseña:");
		
		Password password;
		
		if(numero.equals("")) {
			password = new Password();			
		}else {
			int numeroInt = Integer.parseInt(numero);
			password = new Password(numeroInt);
		}
		
		System.out.println(password.toString());
		
	}

}
