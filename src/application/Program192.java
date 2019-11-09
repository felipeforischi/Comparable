package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

public class Program192 {

	public static void main(String[] args) {

		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\UdemyFiles\\textoTeste192Funcionario.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] campo = funcionarioCsv.split(",");
				list.add(new Funcionario(campo[0], Double.parseDouble(campo[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario func : list) {
				System.out.println(func.getNome() + " - " + func.getSalario());
			}

		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}

}
