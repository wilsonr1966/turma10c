package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.unixyz.util.Magica;

public class ImplementarVenda {

	public static void main(String[] args) {
		Venda venda = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.f("Total"),
				Magica.f("Desconto"),
				Magica.s("Data"),				
				new Cliente(
						Magica.i("ID"),
						Magica.s("Nome"),
						Magica.s("Fone"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Numero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("Cep")	
								)
						),
				new Produto(
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.f("valorVenda"),
						Magica.f("valorCompra"),
						Magica.i("qtde")
						)

				);
		System.out.println(venda.getAll());
		
		
		
		
	}

}
