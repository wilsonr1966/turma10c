package Repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		short dia = Short.parseShort(JOptionPane.showInputDialog("Nacimento dia:"));
		short mes = Short.parseShort(JOptionPane.showInputDialog("Nacimento mes:"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Nacimento ano:"));
		
		while (ano<1950 || ano>2002) {
			 ano = Short.parseShort(JOptionPane.showInputDialog("Ano novamente:"));
		}
			
		while (mes<1 || mes>12) {
			 mes = Short.parseShort(JOptionPane.showInputDialog("Mes novamente:"));
		}

		if (mes==2  || mes==4  || mes==6  || mes==9  || mes==11) {
			while (dia<1 || dia>30) {
			 dia = Short.parseShort(JOptionPane.showInputDialog("Dia novamente:"));
			}
			
		}else 	while (dia<1 || dia>31) {
				 dia = Short.parseShort(JOptionPane.showInputDialog("Dia novamente:"));
		}
		
		System.out.println("Data nascimento: " + dia + "/" + mes + "/" + ano);
			
			
	}

}
