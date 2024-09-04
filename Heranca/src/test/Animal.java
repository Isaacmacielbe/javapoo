package test;

public class Animal {
	 // Atributos da superclasse
    private String nome;
    private int idade;
    
 //Construtor da superclasse
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
 // Método da superclasse
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
    
    
}
