package principal;
//Você pode concatenar strings usando o operador + ou o método concat().


public class Concatenar {

	public static void main(String[] args) {
		String texto1 = "Olá";
		String texto2 = "Mundo";
		
		//Usando o operador +
		String resultado = texto1 + ", " + texto2 + "!";
		
		// Usando o método concat
		String resultado2 = texto1.concat(", ").concat(texto2).concat("!");

	}

}
