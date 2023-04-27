package app;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import dao.ProdutoDAO;
import db.DbException;
import modelo.Produto;

public class Principal {

	public static void main(String[] args) throws DbException {
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
		
		ProdutoDAO dao = new ProdutoDAO();
		
//		Produto prod = new Produto(2, 
//								   "Notebook", 
//								   java.sql.Date.valueOf("2022-01-01"),
//								   30,
//								   new BigDecimal("20000.0")
//						);
		//dao.adicionar(prod);
		//dao.alterar(prod);
		//dao.excluir(3);
		
		Produto produto = dao.buscarPorId(10);
		if (produto != null) {
			System.out.println("Id...........: " + produto.getIdProd());
			System.out.println("Nome produto.: " + produto.getNomeProd());
			System.out.println("Data cadastro: " + fd.format(produto.getDataCadastro()));
			System.out.println("Quantidade...: " + produto.getQuantidade());
			System.out.println("Preço........: " + fm.format(produto.getPreco()));
			System.out.println();
		} else {
			System.out.println("Produto não encontrado!");
		}
		List<Produto> lista = dao.listarTodos();
		
		System.out.println("Lista de Produtos");
		System.out.println("-----------------");
		
		for (Produto produto1 : lista) {
			System.out.println("Id...........: " + produto1.getIdProd());
			System.out.println("Nome produto.: " + produto1.getNomeProd());
			System.out.println("Data cadastro: " + fd.format(produto1.getDataCadastro()));
			System.out.println("Quantidade...: " + produto1.getQuantidade());
			System.out.println("Preço........: " + fm.format(produto1.getPreco()));
			System.out.println();
		}
	}

}
