package excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2SolucaoV3 {
	
	public static void mostraArquivo() throws FileNotFoundException {
		File arquivo = new File("c:\\temp\\arquivo.txt");

		try (Scanner sc = new Scanner(arquivo)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
	}

	public static void main(String[] args) {
		try {
			mostraArquivo();
		} catch (FileNotFoundException e) {
			System.out.println("Erro abrindo arquivo: " + e.getMessage());
		}
	}

}
