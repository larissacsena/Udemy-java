package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//divisao entre inteiros o resultado é sempre um inteiro
		//(F-32) x 5/9 = C
		
		//constante sempre maiusculo
		final double X = 32;
		//.0 para mostrar um resultado decimal
		final double Y = 5.0/9.0;
		
		double celsius;
		double fahrenheit;
		fahrenheit = 86;
		
		celsius = (fahrenheit - X) * Y ;
		System.out.println(celsius);
	} 

}
