package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		String nome = "Maura";
		var sobrenome = "Larissa";
		var idade = 22;
		var salario = 1350.20;
		
		//s para string d para int f para double %2.f define o numero de casas decimais a serem exibidas
		System.out.printf("Nome: %s %s tem %d anos de idade e ganha %.2f reais\n", nome, sobrenome,idade,salario);
		
		//posso colocar numa variavel
		
		String frase = String.format("Nome: %s %s \ntem %d anos de idade \ne ganha %.2f reais", nome, sobrenome,idade,salario);
		System.out.println(frase);
	}
}
