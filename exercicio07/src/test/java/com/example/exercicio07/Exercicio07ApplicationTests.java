package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio07ApplicationTests {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();

		PDDocument documento = new PDDocument(); // Instancia um documento PDF
		PDPage pagina = new PDPage(); // Instancia uma pagina em branco
		documento.addPage(pagina); // Adiciona a pagina no documento
		PDPageContentStream escritor = new PDPageContentStream(documento, pagina); // gera um escritor para a pagina
		PDType1Font fonte = new PDType1Font(Standard14Fonts.FontName.TIMES_BOLD);
		escritor.setFont(fonte, 18.5f);
		escritor.beginText();
		escritor.newLineAtOffset(25, 500);
		escritor.showText("Olá " + nome + "!");
		escritor.newLineAtOffset(0, -60);
		escritor.showText("Você esta dentro do pdf");
		escritor.endText();
		escritor.close();
		documento.save("teste.pdf");
	}
}