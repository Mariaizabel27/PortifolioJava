
public class Testes {

	public static void main(String[] args) {
		
		double x = 10.1549;
		int idade = 35;
		String nome = "camila";
		char texto = 'a';
		boolean valor = true;
		
		System.out.println(x);
		System.out.printf("texto teste: %2f, %s, %S, %d, %C, %b, %n" , x, nome, nome, idade, texto, valor);
		
		//o 2 é relacionado a casa decimal e o %n pula linha como o \n.
		System.out.printf("%.2f%n", x);

		
		}
		}