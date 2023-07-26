import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int senha = 2002;
		
		while (x != senha) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		}
		System.out.println("Senha correta");
		
		sc.close();
}
	}