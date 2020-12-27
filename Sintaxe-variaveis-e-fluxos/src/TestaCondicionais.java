
public class TestaCondicionais {

	public static void main(String[] args) {
		 
		System.out.println("testando condicionais");
		int idade = 16;
		int QuantidadeDePessoas = 3;
		if(idade >= 18) {
			System.out.println("Você é maior de 18 anos");
		}
		else {
			if(QuantidadeDePessoas >= 2) {
				System.out.println("Você não é maior de 18, mas está aconpanhada com mais alguém");
			}else {
				System.out.println("Infelismente você não pode entrar");
			}
		}
		
	 
	 
	}
}
