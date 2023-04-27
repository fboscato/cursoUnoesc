package exercicio1_02_07;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Pessoa> listapessoas = new ArrayList<>();

	// adicionar objetos em ArryList
	public void adicionarPessoas(String nome, int idade, float altura) {
		listapessoas.add(new Pessoa(nome, idade, altura));
	}

	public void imprimirAgenda() {
		for (int cont = 0; cont < listapessoas.size(); cont++) {
			System.out.println("Id" + (cont + 1) + "\nNome: " + listapessoas.get(cont).getNome() + "\nIdade: "
					+ listapessoas.get(cont).getIdade() + "\nAltura: " + listapessoas.get(cont).getAltura());
			System.out.println("------------------");

		}
	}

	public void removerPessoa(String nome) {
		for (int cont = 0; cont < listapessoas.size(); cont++) {
			if (listapessoas.get(cont).getNome().equals(nome)) {
				System.out.println(listapessoas.get(cont).getNome()+" removido da agenda!");
				listapessoas.remove(cont);
			}
		}
	}

	public int buscarPessoa(String nome) {
		for (int cont = 0; cont < listapessoas.size(); cont++) {
			if (listapessoas.get(cont).getNome().equals(nome)) {
				return (cont + 1);
			}
		}
		return 0;
	}
}
