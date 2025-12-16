
package scannerExe;

import java.util.Scanner; // 1. importando a classe Scanner


public class ScannerExe {
	
	//ex 2://
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);//construtor "System.in" para permitir a leitura do teclado.
		 
		 int n1=0; 
	     int n2=0;
	     int res=0;
	     
	     
		 
		 System.out.println("Digite um numeral:");
		 n1=scan.nextInt();
		 
		 System.out.println("Digite um numeral:");
		 n2=scan.nextInt();
		 
		 
		 
		 
		 
		 
		 res=n1*n2;
		 
		 
		 System.out.printf("Multiplicação de %d com %d é igual a %d:", n1, n2, res);
		 
		 
	}

	
	
	
	
	//ex 1://
	
		/*public static void main(String[] args) {
			
			  
			                  
			
			    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

			    int n;
			    int i;

			    System.out.printf("Informe o número para a tabuada:\n");
			    n = ler.nextInt(); // 3 entrada de dados (lendo um valor inteiro)
			    
			    System.out.printf("\n+--Resultado--+\n");
			    for (i=1; i<=10; i++) {
			      System.out.printf("| %2d * %d = %2d |\n", i, n, (i*n));
			    }
			

		}*/
		
	
}	
	
	
	
	
	

	
	












/*Scanner; 
 * permite 
 * fazer a leitura do
 * teclado e passar esse
 * dado pra dentro de uma variavel;
 */



/* ex1: https://www.devmedia.com.br/entrada-de-dados-classe-scanner/21366  */
/* ex2:   CFB cursos aula 4 Scanner Youtube    */


