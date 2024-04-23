package Tabuada;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite uma tabuada: ");
	        int num = sc.nextInt();
	        System.out.println("--- Tabuada do " + num + " ---");
	        System.out.print("Digite uma quantidade de itens: ");
	        int quant = sc.nextInt();

	        StringBuilder tabuadaContent = new StringBuilder();

	        for (int i = 1; i <= quant; i++) {
	            int resultado = num * i;
	            tabuadaContent.append(num).append(" x ").append(i).append(" = ").append(resultado).append("\n");
	        }

	        String fileName = "Tabuada.txt";

	        writeToFile(fileName, tabuadaContent.toString());
	        String content = readFromFile(fileName);
	        System.out.println("Conteudo lido do arquivo: ");
	        System.out.println(content);
	    }

	    public static void writeToFile(String fileName, String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            writer.write(content);
	            System.out.println("Conteúdo escrito no arquivo : " +fileName);
	        } catch (IOException e) {
	            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
	        }
	    }

	    public static String readFromFile(String fileName) {
	        StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;

	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            System.out.println("Erro ao ler do arquivo " + e.getMessage());
	        }
	        return content.toString();
	    }	

	}


