package Repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero a ser adivinhado:"));
		int chute=0;
		int contador=0;
		
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o numero:"));
			contador=contador+1;
			
			if (numero>chute) {
				JOptionPane.showMessageDialog(null,"Numero � maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null,"Numero � menor");
			}
		}while (numero!=chute);
		System.out.println("Parabens, vc acertou com : " + contador + " tentativas");

		
	}

}
