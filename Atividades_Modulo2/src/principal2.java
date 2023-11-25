import java.util.Scanner;

public class principal2 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
	
		Colaborador c = new Colaborador();
		Scanner leitura= new Scanner(System.in);
		
		p.msgPessoa();
		
		System.out.println("Digite seu nome");
		p.nome=leitura.next();
		
		System.out.println("Digite sua idade");
		p.idade=leitura.nextInt();
		
		System.out.println("O nome digitado foi: " + p.nome+ " e a idade dele é "+ p.idade);
		
		
		
		
	

	}

}
