package Atividade390;

public class principal {

	public static void main(String[] args) {
		Encapsulado enc = new Encapsulado();
		Olamundo ola = new Olamundo();
		
		System.out.println(enc.getIdade());
		System.out.println(enc.getNome());
		
		ola.msgMundo();

	}

}
