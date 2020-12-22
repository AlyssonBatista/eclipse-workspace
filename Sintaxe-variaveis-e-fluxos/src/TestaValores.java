
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		String saudacao = "olá, meu nome é ";
		String nome = "romulo ";
		
		String continuacao = "e minha idade é ";
		int idade = 10;
		
		System.out.println(saudacao + nome + continuacao + idade + " anos");
	}
}
