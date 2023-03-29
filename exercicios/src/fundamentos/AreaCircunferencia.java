package fundamentos;

public class AreaCircunferencia {
	//ctrl + space = autocomplete
	public static void main(String[] args) {
		
		//declarei variaveis
		
		double raio = 3.4;
		
		//final = não poder ser alterada = constante
		//constantes com letras maiusculas
		
		final double PI = 3.14159;
		double resultado = PI * raio * raio;
		 
		System.out.println(resultado);
		
		//alterei os valores das variaveis
		raio = 10;
		resultado = PI * raio * raio;
		System.out.println("O resultado: " + resultado);
		
	}
}
