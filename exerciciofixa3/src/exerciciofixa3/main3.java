package exerciciofixa3;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um Numero: ");
		numero = sc.nextInt();
			
		if (numero < -1) {
			System.out.println("NEGATIVO!");
		}
		else if (numero  > 0 ) {
			System.out.println("NÃO NEGATIVO!");
		}
		else {
			System.out.println("NÃO NEGATIVO!");
		}
			
		sc.close();
	}
}
