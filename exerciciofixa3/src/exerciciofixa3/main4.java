package exerciciofixa3;

import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um Numero: ");
		numero = sc.nextInt();
			
		if (numero % 2 == 0 )  {
			System.out.println("PAR");
		}
		else  {
			System.out.println("IMPAR");
		}
			
		sc.close();
	}
}
