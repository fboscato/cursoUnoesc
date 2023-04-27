import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = null;

		File arquivo = new File("c:\\temp\\arquivo.txt");

		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");

		} catch (Exception e) {
			System.out.println("Ocorreu algum erro");

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
