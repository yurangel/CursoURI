package URI_Iniciante;

import java.util.Scanner;

public class Ex_1005 {

	 double A, B, MEDIA;
	 static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
		
		 A = entrada.nextDouble();
		 B = entrada.nextDouble();
		 		 
		 MEDIA = ((A*3.5)+(B*7.5))/11;

		 System.out.printf("MEDIA = %.5f\n", MEDIA);
		         
	}
		  
	
}
