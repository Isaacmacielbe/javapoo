package test;

public class Gato extends Animal{
	// Atributo específico da subclasse Gato
    private String corDoPelo;

    // Construtor da subclasse
    public Gato(String nome, int idade, String corDoPelo) {
        super(nome, idade);  // Chamada ao construtor da superclasse
        this.corDoPelo = corDoPelo;
    }

    // Método específico da subclasse Gato
    public void miar() {
        System.out.println("O gato mia: Miau!");
    }

    // Getters e Setters para cor do pelo
    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    // Sobrescrevendo o método da superclasse
    @Override
    public void fazerSom() {
        System.out.println("O gato faz um som: Miau!");
    }

}
