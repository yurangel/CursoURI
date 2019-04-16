package URI_Iniciante;

import java.util.Scanner;

public class Ex_1008 {

	 int cracha, horas;
	 float vhora;
	 static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
		 
		 cracha = entrada.nextInt();
		 horas = entrada.nextInt();
		 vhora = entrada.nextFloat();

		 System.out.printf("NUMBER = %d\n", cracha);
		 System.out.printf("SALARY = U$ %.2f\n", horas*vhora);
		         
	}
		  
	
}
