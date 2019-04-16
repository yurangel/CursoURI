package URI_Iniciante;

import java.util.Scanner;

public class Ex_1003 {
	
	int A, B, SOMA;
	 
	static Scanner entrada = new Scanner(System.in);
	
	 void Calculo() {
		
		 A = entrada.nextInt();
		 B = entrada.nextInt();

		 SOMA = A+B;

		 System.out.printf("SOMA = %d\n", SOMA);
	}
	
	
}
