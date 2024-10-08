//Desenvolvido por:Maria_Izabel Camila_Morais - Data:09/09/2024

//Finalizar os exercícios: 
//--> Imprimir com 3 casas decimais 
//1-Calculadora Simples 
//2-Calc_IMC 
//3-Fazer um programa que leia três valores com ponto flutuante: A,B e C.Em seguida mostre: 
//(Nome classe: Exe_pontoflutuante)
//a)A área do triângulo retângulo que tem A por base e  C por altura.
//Triangulo = (a * c)/2
//b) A área do circulo de raio C.
//PI = 3.14159
//circulo = PI * (C * C) 
//c)A área do trapézio que tem A e B por bases E e C por altura.
//trapezio = ( a + b) * c /2 
//d)A área do quadrado que tem lado B.
//quadrado = b * b
//e)A área do retângulo que tem lados A e B.
//Retangulo = a * b

import java.util.Scanner;
public class EXE_pontoflutuante {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor do ponto flutuante a: ");
		double  a= scanner.nextDouble();
		
		System.out.println("Digite o valor do ponto flutuante b: ");
		double b = scanner.nextDouble();
		
		System.out.println("Digite o valor do ponto flutuante c: ");
		double  c = scanner.nextDouble();
		
		System.out.println("A área do triângulo retangulo. ");
		double área = (a * c )/2;
		
		System.out.println("A área do circulo de raio c. ");
		double PI = 3.14159;
		double circulo = PI * (c * c);
		
		System.out.println("A área  do trapezio que tem a e b por bases e c por altura.");
		double trapezio= (a + b) * c/2;
		
		System.out.println("A área do quadrado que tem lado b. ");
		double  quadrado = b * b;
		
		System.out.println("A área do retângulo que tem lados a e b. ");
		double retângulo = a * b ;
		
		
		System.out.printf("A) %.3f%n: " , área );
		System.out.printf("A) %.3f%n: " , circulo );
		System.out.printf("A) %.3f%n: " , trapezio );
		System.out.printf("A) %.3f%n: " , quadrado );
		System.out.printf("A) %.3f%n: " , retângulo);
		
	}

}
