package principal;

public class M {

	public static void main(String[] args) {
		String str = "Academico da unifanor";
		char caracteres = str.charAt(2);
		System.out.println(caracteres);
		//CharAt consegue identificar qual o caracteres através da posição passada nos parenteses.
		//Retorna "a";
		
		int firstIndex = str.indexOf("Aca"); // Retorna 0
		int lastIndex = str.lastIndexOf("c"); // Retorna 12
		
		//Retorna a posição da primeira e última recorrência da substring especificada
		System.out.println(firstIndex);
		System.out.println(lastIndex);
		
		
	}

}
