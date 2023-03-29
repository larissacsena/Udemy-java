package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		
		//preciso acompanhar de um L pra transformar um inteiro num long, mesmo após declarar
		//definir as casas decimais com "_"
//		long pontosAcumulados = 3_234_845_223;
		long pontosAcumulados = 3_234_845_223L;
		/* 1- se eu colocar que variavel = 22 isso aqui é automaticamente um int
		 * 2- se eu colocar que variavel = 2.5 isso aqui é automaticamente um double
		 * 3 - POR PADRAO É DEFINIDO ASSIM
		 * 4-ENTÃO: APÓS UM FLOAT PRECISO COLOCAR F PARA VIRAR FLOAT
		 * */
//		float salario = 11_445.44;  -- sem F vira um double
		// o double não cabe dentro de um float
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
	}
}
