package constructor;

public class Principal { // classe principal

	public static void main(String[] args) {
		
		// Construtor -> é um método especial que é chamado quando um objeto é instanciado (criado).
		
		// objetivo do construtor é propor que vc utilize/crie
		// diferentes objetos com diferentes informações/parâmetros na mesma classe.
		
		/* Nos passos iniciais para a construção de um objeto a ser instanciado, colocariamos o nome
		da classe em questão, no caso "Teste", o tipo do objeto "teste" ...*/
		
		
		Pessoa pessoa1 = new Pessoa("Richarlison", 24, 200);
		Pessoa pessoa2 = new Pessoa("Raíííçççaaaa", 50, 400);
		
		
		
		
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa2.nome);
		
		
		System.out.println(pessoa1.idade);
		System.out.println(pessoa2.idade);
		
		
		System.out.println(pessoa1.peso);
		System.out.println(pessoa2.peso);
		
		
	}

}
