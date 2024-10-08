//Feito por:Maria Izabel_Camila Morais - Data:05/09/2024

import java.util.Scanner;
public class CalculadoraSimples {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		      

		        int opcao = 0;

		        while (opcao != 5) {
		           
		            System.out.println("Escolha uma operação:");
		            System.out.println("1. Adição");
		            System.out.println("2. Subtração");
		            System.out.println("3. Multiplicação");
		            System.out.println("4. Divisão");
		            System.out.println("5. Sair");
		            System.out.print("Opção: ");
		            opcao = scanner.nextInt();

		            if (opcao == 5) {
		                System.out.println("Saindo,obrigada por utilizar a calculadora simples :) .");
		                break;
		            }

		            System.out.print("Digite o primeiro número: ");
		            double num1 = scanner.nextDouble();
		            System.out.print("Digite o segundo número: ");
		            double num2 = scanner.nextDouble();

		            switch (opcao) {
		                case 1:
		                    System.out.println("Resultado: " + (num1 + num2));
		                    break;
		                    
		                case 2:
		                    System.out.println("Resultado: " + (num1 - num2));
		                    break;
		                    
		                case 3:
		                    System.out.println("Resultado: " + (num1 * num2));
		                    break;
		                    
		                case 4:
		                    while (num2 == 0) {
		                        System.out.println("Erro: Divisão por zero não é permitida.");
		                        System.out.print("Digite um divisor diferente de zero: ");
		                        num2 = scanner.nextDouble();
		                    }
		                    System.out.println("Resultado: " + (num1 / num2));
		                    break;
		                    
		                default:
		                    System.out.println("Opção inválida! Tente novamente :( .");
		            }
		        }

		        scanner.close();
		    }
		}
