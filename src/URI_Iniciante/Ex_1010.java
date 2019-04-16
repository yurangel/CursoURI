package URI_Iniciante;

import java.util.Scanner;

public class Ex_1010 {

	 int cd1, cd2, num1, num2;
	 float valor1, valor2;
	 static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
		 
		 cd1 = entrada.nextInt();
		 num1 = entrada.nextInt();
		 valor1 = entrada.nextFloat();
		 cd2 = entrada.nextInt();
		 num2 = entrada.nextInt();
		 valor2 = entrada.nextFloat();

		 System.out.printf("VALOR A PAGAR: R$ %.2f\n", ((num1*valor1)+(num2*valor2)));
		         
	}
		  
	
}
