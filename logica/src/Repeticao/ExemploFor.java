package Repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador));
		}
		
		
	}

}
