import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	 
		sc.close();
	}

	;
}

//exercio 1 soma

//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//	
//		int a , b , soma ;
//
//		a = sc.nextInt();
//		
//		b = sc.nextInt();
//		
//		soma = a + b ;
//		
//		System.out.println("soma = " + soma);
//		
//		sc.close();

//exercicio 2 PI = 3.14159;
//
//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double r , a ,pi = 3.14159;
//	
//		r = sc.nextDouble();
//		
//		a = pi * r * r;
//		
//		
//		System.out.printf("a=%.4f%n " , a);
//		
//		sc.close();

//exercio 3 diferenca

//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//	int a , b , c, d , diferenca;
//	
//	a = sc.nextInt();
//	b = sc.nextInt();
//	c = sc.nextInt();
//	d = sc.nextInt();
//	
//	diferenca = (a * b) - (c *d);
//	
//	System.out.println("diferenca = " + diferenca );
//	
//		sc.close();

//exericio 4 salario funcionario

//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//    
//	int numero , hora ;
//	double valorhora , salario;
//	
//	numero = sc.nextInt();
//	hora = sc.nextInt();
//	
//	valorhora = sc.nextDouble();
//	
//	salario = valorhora * hora; 
//	
//	System.out.println("numero = " + numero);
//	
//	System.out.printf("salario =  U$% .2f%n" ,salario);
//	
//	
//		sc.close();

//exercicio 5 pecas tabela
//
//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//   
//	int cod1 , cod2 , qtd1,qtd2;	
//	double preco1, preco2, total;
//	
//	cod1 = sc.nextInt();
//	qtd1 = sc.nextInt();
//	preco1 = sc.nextDouble();
//	
//	cod2 = sc.nextInt();
//	qtd2 = sc.nextInt();
//	preco2 = sc.nextDouble();
//	
//	total = preco1 * qtd1 + preco2 *  qtd2;
//	
//	System.out.printf("valor a pagar: R$ %.2f%n " , total);
//	
//		sc.close();

//exercicio 6 area forma
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//    
//		double a,b,c, triangulo ,circulo, trapezio, quadrado, retangulo;
//		
//	 a = sc.nextDouble();
//	 b = sc.nextDouble();
//	 c = sc.nextDouble();	
//	    
//	triangulo = a * c / 2.0;
//	circulo = 3.14159 * c * c;
//	trapezio = (a + b) /2.0 * c ;
//	quadrado = b * b;
//	retangulo = a * b;
//			 		 
//	 System.out.printf (" triangulo:% .3f%n ", triangulo);
//	 
//	 System.out.printf (" circulo:% .3f%n ", circulo );
//	 System.out.printf (" trapeio:% .3f%n", trapezio );
//	 System.out.printf (" quadrado:% .3f%n", quadrado );
//	 System.out.printf (" retangulo:% .3f%n", retangulo);
//	 
//	 
//		sc.close();