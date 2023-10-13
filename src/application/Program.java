package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*Define a localidade para os EUA*/
		Locale.setDefault(Locale.US);
		/*Método para inscerção de arquivos*/
		Scanner sc = new Scanner (System.in);
		/*
		 * Método para configurar data em um padrão de mascara
		 * */
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		 boolean entradaValida = false;
	        int numero = 0;

	        while (!entradaValida) {
	            System.out.print("Digite um número: ");
	            String input = sc.nextLine();

	            try {
	                // Tenta converter a entrada para um número inteiro
	                numero = Integer.parseInt(input);
	                entradaValida = true; // Se a conversão for bem-sucedida, saia do loop
	            } catch (NumberFormatException e) {
	                // Se a entrada não puder ser convertida para um número, imprima uma mensagem de erro
	                System.out.println("Por favor, digite um número válido.");
	            }
	        }

	        System.out.println("Você digitou: " + numero);
	        // Faça o que quiser com o número após a entrada ser válida
	        
	        System.out.print("Data do contrato dd/MM/yyyy: ");
			LocalDate data = LocalDate.parse(sc.next(),fmt);
			System.out.print("Entre com o valor do contrato: ");
			double valorTotal = sc.nextDouble();
	    }
		
		
	}


