package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		aluno.setNome(JOptionPane.showInputDialog("Nome").toLowerCase());
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Rm")));
		
		System.out.println("RM....: " + aluno.getRm());
		System.out.println("Nome..: " + aluno.getNome());
		System.out.println("Email.: " + aluno.getEmail());
		
		System.out.println(aluno.getAll());
		
	}

}
