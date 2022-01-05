package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Main_java {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String original = "abcd FHIJ ABC abc DEFG" ;
		String s01 = original.toLowerCase();
		
		System.out.println("original: " + original);
		System.out.println("tolowercase; " + s01);
		System.out.println(s01);
		
		
	sc.close();
		}
	
	

}
//exercicio de apoio while
//int x = sc.nextInt();
//int soma = 0 ;
//while (x != 0) {
//	soma = soma + x;
//	x = sc.nextInt();
//}
//	
//System.out.println(soma);
//exercicio de apoio for 
//int n = sc.nextInt();
//      int soma = 0 ;
//		for ( int i=0; i<n; i=i+1 ) {
//			int x = sc.nextInt();
//			soma = soma + x ;
//		}
//		
//		System.out.println(soma);
//
//exemplo
//for (int i=4; i>= 0; i--) {
//	System.out.println("valor de i: " +  i) ;

//exemplo 
//char resp ;
//do {
//	 System.out.print("Digite a temperatura em celcius: ");
//    
//    double c = sc.nextDouble();
//    double f = 9.0 * c / 5.0 +32.0;
//	
//    System.out.printf("equivalente em farenheit: %.1f%n" , f);
//    System.out.print("deseja repetir (s/n)? ");
//    
//  resp = sc.next().charAt(0);
//}while (resp != 'n');

//exercicio de apoio 1 while
//int senha = sc.nextInt();
//while (senha != 2002) {
//System.out.println("senha invalida");
//senha = sc.nextInt();
//
//}
//System.out.printf("acesso permitido");
//exercicio 2 while
//int x = sc.nextInt();
//int y = sc.nextInt();
//
//while (x != 0 && y != 0){
//	if (x > 0 && y > 0) {
//		System.out.println("primeiro");
//	}
// 
//	else if (x < 0 && y > 0) {
//		System.out.println("segundo");
//	}
//	
//	else if (x < 0 && y < 0) {
//		System.out.println("terceiro");
//	}
//	else {
//		System.out.println("quarto");
//	}
//	x = sc.nextInt();
//	y = sc.nextInt();
//}
//	exercicio 3 while

//int alcool = 0 ;
//int gasolina = 0 ;
//int diesel = 0 ;
//
//int tipo = sc.nextInt();
//
//while (tipo != 4) {
//if (tipo == 1 ) {
//	alcool = alcool +1;
//}
//else if (tipo == 2 ) {
//	gasolina = gasolina +1;
//}
//if (tipo == 3 ) {
//	diesel = diesel +1;
//	
//}
//
//tipo = sc.nextInt();
//}
//
//System.out.println("muito obrigado");
//System.out.println("alcool " + alcool);
//System.out.println("gasolina " + gasolina);
//System.out.println("diesel " + diesel);