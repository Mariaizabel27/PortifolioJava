//Utilizando o for 
//Desenvolvido por:Camila e Maria  
import java.util.Scanner;
public class Exe_04 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       System.out.print("Digite um número inteiro: ");
       int N = scanner.nextInt();
      
       System.out.println("Divisores de " + N + ":");
      
      
       for (int i = 1; i <= N; i++) {
           if (N % i == 0) {
               System.out.println(i);
           }
       }
       scanner.close();
   }
}

