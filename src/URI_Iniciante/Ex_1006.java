package URI_Iniciante;

import java.util.Scanner;

public class Ex_1006 {

	 double A, B, C, MEDIA;
	 static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
		
		 A = entrada.nextDouble();
		 B = entrada.nextDouble();
		 C = entrada.nextDouble();
		 		 
		 MEDIA = ((A*2)+(B*3)+(C*5))/10;

		 System.out.printf("MEDIA = %.1f\n", MEDIA);
		         
	}
		  
	
}
