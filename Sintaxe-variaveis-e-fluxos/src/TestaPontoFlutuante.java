
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		 
		double salario = 1250.45;
		
		System.out.println("o meu salario � " + salario);
		
		int divisao = 8/3;
		System.out.println("A divis�o � " + divisao); //n�o divide corretamente
		
		double  divisao1 = 8/3;
		System.out.println("A divis�o � " + divisao1); //Ainda n�o divide corretamente pois os numeros s�o inteiros
		
		double divisao3 = 8.0/3;
		System.out.println("A divis�o � " + divisao3); //Dividiu corretamente pois um dos n�meros tem ponto flutuante 
		
		
		
	}
}
