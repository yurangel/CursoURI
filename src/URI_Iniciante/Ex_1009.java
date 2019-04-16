package URI_Iniciante;

import java.util.Scanner;

public class Ex_1009 {

	 String nome;
	 double salario, vendas;
	 static Scanner entrada = new Scanner(System.in);
	 
	 void Calculo() {
		 
		 nome = entrada.next();
		 salario = entrada.nextDouble();
		 vendas = entrada.nextFloat();

		 System.out.printf("TOTAL = R$ %.2f\n", salario+(vendas*0.15));
		         
	}
		  
	
}
