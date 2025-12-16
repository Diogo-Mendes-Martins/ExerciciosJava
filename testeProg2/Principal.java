package testeProg2;

import java.util.Scanner;

public class Principal {
    public static void main ( String args [ ] ) throws InterruptedException {
        int divisor , dividendo , quociente = 0;
        String controle = "s";
        
        Scanner s = new Scanner ( System.in );
        do {    
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();
            //quociente = dividendo / divisor;
            
            try {
            	quociente = dividendo / divisor;
            
            } catch (Exception e)
            	{ System.out.println("ERRO: Divisão por zero!");
            	
            	}
            
            
            
            
            System.out.println ( "O quociente é: " + quociente );
            System.out.println ( "Repetir?" );
            controle = s.next().toString();
        } while ( controle.equals( "s" ) );
        s.close();
}    
}


/*
public class Exception {
	public static int divisao (int dividendo, int divisor) {
		return dividendo / divisor;

}




public static void main(String[] args) {
	try {
		int resultado = divisao(10,0);
		System.out.println("Resultado: " + resultado);
	} 
	catch (ArithmeticException e) {
		System.out.println("Erro: divisão por zero");
	}

}
}*/
