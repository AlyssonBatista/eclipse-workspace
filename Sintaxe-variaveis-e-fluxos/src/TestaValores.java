
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		String saudacao = "ol�, meu nome � ";
		String nome = "romulo ";
		
		String continuacao = "e minha idade � ";
		int idade = 10;
		
		System.out.println(saudacao + nome + continuacao + idade + " anos");
	}
}
