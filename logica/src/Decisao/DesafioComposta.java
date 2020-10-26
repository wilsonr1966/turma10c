package Decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Nome do Veiculo:").toUpperCase();
		byte pass = Byte.parseByte(JOptionPane.showInputDialog("Capacidade de passageiros:"));
			
		if (pass==2) {
			System.out.println("Nome: " + nome);
			System.out.println("Veiculo categora A");
		}else	
			if (pass>=4 && pass<=7 ) {
				System.out.println("Nome: " + nome);
				System.out.println("Veiculo categora B");
				}else	
					if (pass>7) {
						System.out.println("Nome: " + nome);
						System.out.println("Veiculo categora C");
		}		
		
		
		
	}

}
