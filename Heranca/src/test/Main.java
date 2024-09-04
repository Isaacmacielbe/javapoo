package test;

public class Main {

	public static void main(String[] args) {
		 Gato gato = new Gato("Felix", 3, "Preto");
	        
	        // Usando métodos herdados da superclasse
	        System.out.println("Nome: " + gato.getNome());  // "Nome: Felix"
	        System.out.println("Idade: " + gato.getIdade());  // "Idade: 3"
	        
	        // Usando método específico da subclasse
	        gato.miar();  // "O gato mia: Miau!"
	        
	        // Usando método sobrescrito
	        gato.fazerSom();  // "O gato faz um som: Miau!"
	}

}
