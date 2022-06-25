import java.util.Locale;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		int y;
		
		x = sc.nextDouble();
		y = sc.nextInt();
		
		System.out.printf("Vc digitou: %.3f flutuante %n", x);
		System.out.println("Você digitou: " + x + " flutuante");
		System.out.println("Você digitou: " + y + " inteiro");
		
		sc.close();

	}

}
