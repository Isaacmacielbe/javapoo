package principal;
//Para comparar strings, você pode usar o método equals() ou equalsIgnoreCase().


public class Comparar {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		
		//Comparações exatas
		boolean igual = a.equals(b);

		//Comparações ignorando maiúsucla/minúscula
		boolean igualIgnorandoCases = a.equalsIgnoreCase(b);
	}

}
