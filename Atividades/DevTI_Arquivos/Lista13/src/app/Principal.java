package app;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import dao.PessoaDAO;
import db.DbException;
import modelo.Pessoa;

public class Principal {

	public static void main(String[] args) throws DbException {
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();

		PessoaDAO dao = new PessoaDAO();

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==========MENU==========");
		System.out.println("1. Incluir produto");
		System.out.println("2. Alterar produto");
		System.out.println("3. Excluir produto");
		System.out.println("4. Listar produto");
		System.out.println("5. Consultar produto");
		System.out.println("6. Finalizar programa");
		int opcao = entrada.nextInt();
		
		if (opcao = 1) {
		Pessoa pessoa = dao.buscarPorId(10);
			System.out.println("Id.............: " + pessoa.getidPessoa());
			System.out.println("Nome pessoa....: " + pessoa.getNomePessoa());
			System.out.println("Data nascimento: " + fd.format(pessoa.getDataNascimento()));
			System.out.println("Salário........: " + fm.format(pessoa.getSalario()));
			System.out.println();
		} else if {
			
			System.out.println("Pessoa não localizada!");
		}
		List<Pessoa> lista = dao.listarTodos();

		System.out.println("Lista de Pessoas");
		System.out.println("-----------------");

		for (Pessoa pessoa1 : lista) {
			System.out.println("Id...........: " + pessoa1.getidPessoa());
			System.out.println("Nome pessoa.: " + pessoa1.getNomePessoa());
			System.out.println("Data nascimento: " + fd.format(pessoa1.getDataNascimento()));
			System.out.println("Salário........: " + fm.format(pessoa1.getSalario()));
			System.out.println();
		}
	}

}
