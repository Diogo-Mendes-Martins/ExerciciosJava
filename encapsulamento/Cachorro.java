package encapsulamento;

public class Cachorro {
	
	private String cor;
	private int idade; //com métodos privados vc nao consegue 
	private int peso;  // dessa amneira é necessário usar os métodos get e set para ger acesso as infos protegidas.
	
	//construtor:
	
	Cachorro(String cor, int idade, int peso){
		
		this.cor = cor;
		this.idade = idade;
		this.peso = peso;
		
		
		
	}
	
	
	
	

}
