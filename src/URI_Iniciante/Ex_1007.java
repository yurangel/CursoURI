package URI_Iniciante;

import java.util.Scanner;

public class Ex_1007 {

	 int A, B, C, D, DIFERENCA;
	 static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
		 
		 A = entrada.nextInt();
		 B = entrada.nextInt();
		 C = entrada.nextInt();
		 D = entrada.nextInt();
		 		 
		 DIFERENCA = (A*B-C*D);

		 System.out.printf("DIFERENCA = %d\n", DIFERENCA);
		         
	}
		  
	
}
