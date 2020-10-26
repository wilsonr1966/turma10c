package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementaAluno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.SetAll(
				Integer.parseInt(JOptionPane.showInputDialog("Rm")),
				JOptionPane.showInputDialog("Nome").toLowerCase(),
				JOptionPane.showInputDialog("Email").toLowerCase()
				);
		System.out.println(aluno.getAll());
		
		
		
	}

}
