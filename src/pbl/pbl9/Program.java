package pbl.pbl9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Movie> list = new ArrayList<>();

		System.out.println("Defina o caminho do arquivo: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\FilmesTotalizado.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String Titulo = fields[0];
				double Pais = Double.parseDouble(fields[1]);
				int Visualizacoes = Integer.parseInt(fields[2]);

				list.add(new Movie(Titulo, Pais, Visualizacoes));

				itemCsv = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Movie item : list) {
					bw.write(item.getTitulo() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " Criado com sucesso!");
				
			} catch (IOException e) {
				System.out.println("Erro escrevendo arquivo: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Erro lendo arquivo: " + e.getMessage());
		}
		sc.close();
	}
}