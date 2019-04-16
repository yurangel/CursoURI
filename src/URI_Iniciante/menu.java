package URI_Iniciante;

import java.util.Scanner;

public class menu {
	
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int escolha=0;
		
	    do {
	    	System.out.println("Escolha o exercicio: \n"
		      		+ "1. 1001\n"
		      		+ "2. 1002\n"
		      		+ "3. 1003\n"
		      		+ "4. 1004\n"
		      		+ "5. 1005\n"
		      		+ "6. 1006\n"
		      		+ "7. 1007\n"
		      		+ "8. 1008\n"
		      		+ "9. 1009\n"
		      		+ "10. 1010\n");
	    	
		    escolha = entrada.nextInt();
	      
		    switch(escolha) {
		    
		    case 0:
		    	
			    break;    
		    
		    case 1:
		    	Ex_1001 ex_01 = new Ex_1001();
		    	ex_01.Calculo();
		    	
			    break;
			    
		    case 2:
		    	Ex_1002 ex_02 = new Ex_1002();
		    	ex_02.Calculo();
		    	
			    break;
			    
		    case 3:
		    	Ex_1003 ex_03 = new Ex_1003();
		    	ex_03.Calculo();
		    	
			    break;
			    
		    case 4:
		    	Ex_1004 ex_04 = new Ex_1004();
		    	ex_04.Calculo();
		    	
			    break;
			    
		    case 5:
		    	Ex_1005 ex_05 = new Ex_1005();
		    	ex_05.Calculo();
			    break;
			    
		    case 6:
		    	Ex_1006 ex_06 = new Ex_1006();
		    	ex_06.Calculo();
		    	
			    break;
			    
		    case 7:
		    	Ex_1007 ex_07 = new Ex_1007();
		    	ex_07.Calculo();
		    	
			    break;
			    
		    case 8:
		    	Ex_1008 ex_08 = new Ex_1008();
		    	ex_08.Calculo();
		    	
			    break;
			    
		    case 9:
		    	Ex_1009 ex_09 = new Ex_1009();
		    	ex_09.Calculo();
		    	
			    break;
			    
		    case 10:
		    	
			    break;
			    
		    default:
		    	System.out.println("Entre com um valor válido:");
		    
		    }
		    
	    }while ( escolha != 0);
		
	    System.out.println("Fim do programa");
       
 //fim_do_programa
    }
 }
