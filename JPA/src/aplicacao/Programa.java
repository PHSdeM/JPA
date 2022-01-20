package aplicacao;



import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Mayara", "mayara@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joao", "joao@gmail.com");
		Pessoa p3 = new Pessoa(null, "Marcos", "marcos@gmail.com");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}