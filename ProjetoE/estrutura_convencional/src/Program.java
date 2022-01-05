import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);	
		
        sc.close();
	}

}

//sem orientacao objeto

//double xa, xb, xc, ya, yb, yc;
//
//System.out.println("Enter the measures of triangle x");
//
//xa = sc.nextDouble();
//xb = sc.nextDouble();
//xc = sc.nextDouble();
//
//System.out.println("Enter the measures of triangle y");
//
//ya = sc.nextDouble();
//yb = sc.nextDouble();
//yc = sc.nextDouble();
//
//double p = (xa + xb + xc) / 2.0;
//double areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
//
//p = (ya + yb + yc) / 2.0;
//double areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
//
//System.out.printf("triangle x area: %.4f%n" , areax);
//System.out.printf("triangle y area: %.4f%n" , areay);
//
//if (areax > areay) {
//	System.out.println("larger area: x");
//}
//
//else {
//	System.out.println("larger area: y");
//}
