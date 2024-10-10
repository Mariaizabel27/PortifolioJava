//Utilizado para calcular o salario do funcionario
import java.util.Scanner;
public class Funcionario {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o numero do funcionario: ");
		int num = scanner.nextInt();
		
		System.out.println("digite suas horas trabalhadas: ");
		int horas = scanner.nextInt();
		
		System.out.println("digite o valor que recebe por hora: ");
		double valor = scanner.nextDouble();
		
		double salario = horas* valor;
		
		System.out.println("numero = " + num + "");
		System.out.println("o salario é de: " + horas + " * " + valor + " = " + "U$" + salario + "");
	}



	}


