package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Produto;
import br.com.unixyz.util.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.setQtde(Magica.i("QTde"));
		p.setValorCompra(Magica.f("Compra"));
		p.setValorVenda(Magica.f("Venda"));
		
		System.out.println("Total de Compra:" + p.totalCompra());
		System.out.println("Total de Venda:" + p.totalVenda());
		System.out.println("Venda com 10%:" + p.getDesconto());
		System.out.println("Venda com xx%::" + p.getDesconto(Magica.f("Porc")));
		p.ajustarValores(Magica.f("Valor a ser adicionado"));
		
		System.out.println(p.getValorCompra());
		System.out.println(p.getValorVenda());
		
		
	}

}
