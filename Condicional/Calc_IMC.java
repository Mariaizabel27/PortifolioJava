//Utilizado para calcular o IMC da pessoa
import java.util.Scanner;
public class Calc_IMC {

	public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
			String nome = scanner.nextLine();
			
			System.out.println("Digite seu sexo: ");
			char  sexo = scanner.nextLine().charAt(0);
			
			System.out.println("Digite sua idade: ");
			int idade = scanner.nextInt();
			
			System.out.println("Digite seu peso: ");
			double peso = scanner.nextDouble();
			
			System.out.println("Digite sua altura: ");
			double altura = scanner.nextDouble();
			
			double IMC = peso/ (altura * altura) ;
			
			System.out.println("seu imc é de:"  + IMC );
			
			String classificação;
			   if (IMC < 18.5) {
		            classificação = "Abaixo do peso";
		        } else if (IMC >= 18.6 && IMC <= 24.9) {
		            classificação = "Peso ideal (parabéns)";
		            
		        } else if (IMC >= 25.0 && IMC <= 29.9) {
		            classificação = "Levemente acima do peso";
		            
		        } else if (IMC >= 30.0 && IMC <= 34.9) {
		            classificação = "Obesidade grau I";
		            
		        } else if (IMC >= 35.0 && IMC <= 39.9) {
		            classificação = "Obesidade grau II (severa)";
		            
		        } else {
		            classificação = "Obesidade III (mórbida)";
		        }

			   System.out.println("Sua classificação é: " + classificação);
			   
			   scanner.close();
			   
			
			

	}

}
