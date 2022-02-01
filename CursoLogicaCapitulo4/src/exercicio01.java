/* Exercício : Calculadora Simples */

import java.util.Scanner;

public class exercicio01 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Escolha a operação [1 = adição / 2 = subtração / 3 = multiplicação / 4 = divisão] : ");
		Integer operacaoDesejada = scanner.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if(operacaoDesejada.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
			
		    }
		if(operacaoDesejada.equals(2)) {
			    resultado = primeiroNumero - segundoNumero;
			    
		        }
		if(operacaoDesejada.equals(3)) {
		        	resultado = primeiroNumero * segundoNumero;
		        	
		            }
		if(operacaoDesejada.equals(4)) {
		            	resultado = primeiroNumero / segundoNumero;
		            }
		            System.out.println();
		            System.out.println("O resultado é: " + resultado);
		            
		scanner.close();
		}
		
	   
	}


