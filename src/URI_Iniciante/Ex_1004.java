package URI_Iniciante;

import java.util.Scanner;

public class Ex_1004 {
	
	int A, B, PROD;
	static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
	
		 A = entrada.nextInt();
		 B = entrada.nextInt();

		 PROD = A*B;

		 System.out.printf("PROD = %d\n", PROD);
	}
	
	
}
