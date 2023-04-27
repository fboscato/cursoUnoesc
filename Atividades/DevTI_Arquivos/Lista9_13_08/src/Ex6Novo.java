import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6Novo {

	public static void mostrarArquivo() {
		File arquivo = new File("c:\\temp\\arquivo.txt");
		
		try (Scanner sc = new Scanner(arquivo)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public static void main(String[] args) {
		mostrarArquivo();
	}
}
