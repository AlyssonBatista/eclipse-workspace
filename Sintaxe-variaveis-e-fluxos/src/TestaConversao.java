
public class TestaConversao {

	public static void main(String[]args){
		double salario = 1234.45;
		int valor = (int)salario;// Na conversão de double pra inteiro ele acaba convertendo somente a parte inteira e descatando tudo depois do ponto
		
		System.out.println("O salario de Alysson é " + valor);
	}
}
