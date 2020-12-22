
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		 
		double salario = 1250.45;
		
		System.out.println("o meu salario é " + salario);
		
		int divisao = 8/3;
		System.out.println("A divisão é " + divisao); //não divide corretamente
		
		double  divisao1 = 8/3;
		System.out.println("A divisão é " + divisao1); //Ainda não divide corretamente pois os numeros são inteiros
		
		double divisao3 = 8.0/3;
		System.out.println("A divisão é " + divisao3); //Dividiu corretamente pois um dos números tem ponto flutuante 
		
		
		
	}
}
