import dto.Serie;
import javax.swing.JOptionPane;

public class SerieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String titulo = JOptionPane.showInputDialog("Introduzca el titulo:");
		
		String numeroTemporadas = JOptionPane.showInputDialog("Introduzca el nº de temporadas:");
		
		String genero = JOptionPane.showInputDialog("Introduzca el genero:");
		
		String creador = JOptionPane.showInputDialog("Introduzca el creador:");
		
		Serie s1;
		
		if(!titulo.equals("") && !numeroTemporadas.equals("") && !genero.equals("") && !creador.equals("")) {
			int numeroTemporadasInt = Integer.parseInt(numeroTemporadas);
			s1 = new Serie(titulo, numeroTemporadasInt, genero, creador);
		}else if(!titulo.equals("") && !creador.equals("")) {
			s1 = new Serie(titulo, creador);
		}else {
			s1 = new Serie();
		}
		
		System.out.println(s1.toString());
		
	}

}
