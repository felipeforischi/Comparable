package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		String path = "C:\\UdemyFiles\\textoTeste192.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String nome = br.readLine();
			while (nome != null) {
				list.add(nome);
				nome = br.readLine();
			}
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}

		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}

}
