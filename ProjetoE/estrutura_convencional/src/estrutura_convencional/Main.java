package estrutura_convencional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
	
    	
			sc.close();

	}
}


//exercicio 1 
//int numero = sc.nextInt();
//
//			if (numero < 0) {
//				System.out.println("negativo");
//				
//			}
//			else {
//				
//				System.out.println("nao negativo");
//			}

//exercicio 2
//int N = sc.nextInt();
//
//if (N %2==0 ) { 
//	System.out.println("par");	
//}
//
//	else {
//	System.out.println("impar");
//}

//exercicio 3 
//int a = sc.nextInt();
//int b = sc.nextInt();
//
//if (a % b == 0 || b % a == 0) {
//	System.out.println("sao multiplos");
//	
//}
//else {
//	System.out.println("nao sao multiplos");
//}

//exercicio 4 
//int hinicial = sc.nextInt();
//int  hfinal = sc.nextInt();	
//
//int duracao;
//
//if ( hinicial < hfinal ) {
//	duracao = hfinal -hinicial;
//}
//else {
//	duracao = 24 - hinicial + hfinal;
//}
//System.out.println(" o jogo durou " + duracao + " hora (S) ");

//exercicio 5 
//
//int codigo = sc.nextInt();
//int quantidade  = sc.nextInt();
//
//double total;
//
//if  (codigo == 1){
//	total = quantidade * 4.0;
//}
//
//else if (codigo == 2) {
//	
//	total = quantidade * 4.5;
//}	
//else if (codigo == 3) {
//	
//   total = quantidade * 5.0;
//			
//  	}
//
//else if (codigo == 4) {
//	total = quantidade * 2.0;
//}
//
//else  {
//	total = quantidade * 1.5;
//}
//
//System.out.printf(" Total: R$% .2f%n " , total);

//exercicio 6
//double numero = sc.nextDouble();
//
//if (numero < 0.0 || numero > 100.0) {
//	System.out.println(" Fora de intervalo ");
//}
//
//else if (numero <= 25.0) {
//	System.out.println("intervalo [0.25]");
//}
//
//else if (numero <= 50.0) {
//	System.out.println("intervalo [25,50]");
//}
//
//else if (numero <= 75.0) {
//	System.out.println("intervalo [50,75]");
//	
//}
//
//else {
//	System.out.println("intervalo [75,100]");
//}

//exercicio 07
//
//double x = sc.nextDouble();
//double y = sc.nextDouble();
//
//if (x == 0.0 && y == 0.0 ) {
//	System.out.println("Origem");
//}
//
//else if (x == 0.0) {
//	System.out.println(" eixo x");
//}
//
//else if (y == 0.0) {
//	System.out.println(" eixo y");
//}
//else if (x > 0.0 && y > 0.0 ) {
//	System.out.println("Q1");
//}
//else if (x < 0.0 && y > 0.0) {
//	System.out.println("Q2");
//}
//else if (x < 0.0 && y <0.0) {
//	System.out.println("Q3");
//}
//else {
//	System.out.println("Q4");
//}
//
//exercicio 08
//double salario = sc.nextDouble(); 
//double imposto ;
//
//if (salario <= 2000.0) {
//	imposto = 0.0 ;
//}
//	
//else if (salario <= 3000.0) {
//	imposto = (salario - 2000.0 ) * 0.18 + 1000.0 * 0.08;
//}
//else if (salario <= 4000.0) {
//	imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//}
//else {
//	imposto = (salario - 4500.0)* 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//}
//	
//if (imposto == 0 ) {
//	System.out.println("isento");
//}
//else {
//	System.out.printf("R$% .2f%n" , imposto);
//}