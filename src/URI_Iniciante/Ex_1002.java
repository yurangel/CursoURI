package URI_Iniciante;

import java.util.Scanner;

public class Ex_1002 {
	
	double A, raio;
	static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {		
		
		 A = entrada.nextDouble();
		 		 
		 raio = 3.14159*(A*A);

		 System.out.printf("A = %.4f\n", raio);
	}
	
	
}
