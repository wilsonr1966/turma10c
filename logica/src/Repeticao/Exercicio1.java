package Repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String nivel="";
		int totalM=0;
		int totalS=0;
		int totalP=0;
		do {
			nivel = JOptionPane.showInputDialog("Escolaridade, digite M=M�dio, S=Superior ou P=P�s").toUpperCase();
			if (nivel.equals("M")) {
				totalM=totalM+1;
			}else if (nivel.equals("S")) {
						totalS=totalS+1;
					}else if (nivel.equals("P")) {
							totalP=totalP+1;
			}
		}while ( nivel.equals("M") || nivel.equals("S") || nivel.equals("P") );
				
		System.out.println("Total M�dio M....: " + totalM);
		System.out.println("Total Superior S.: " + totalS);
		System.out.println("Total P�s P......: " + totalP);
		
		
		
	}

}
