package fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Olá mundo !");
		System.out.print("Olá dia! ");
		
		//ln quebra a linha apenas após a primeira execução/ quebra a linha p/ o próximo
		System.out.println("Olá mundo!");
		System.out.print("Olá dia!\n");
		
		//qual é a entrada que quero scanear
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		//armazenar o valor que será digitado numa variável
		//next line para string
		String nome = teclado.nextLine();
		
		System.out.println(nome);
		
		System.out.println("Digite sua idade: ");
		//next int para inteiro
		int idade = teclado.nextInt();
		
		System.out.print(idade);
		
		//fechar o scanner pois fica ocupando recursos
		teclado.close();
	
	}
	
}
