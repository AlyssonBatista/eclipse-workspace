
public class TestaCondicionais {

	public static void main(String[] args) {
		/*
		System.out.println("testando condicionais");
		int idade = 16;
		int QuantidadeDePessoas = 3;
		if(idade >= 18) {
			System.out.println("Voc� � maior de 18 anos");
		}
		else {
			if(QuantidadeDePessoas >= 2) {
				System.out.println("Voc� n�o � maior de 18, mas est� aconpanhada com mais algu�m");
			}else {
				System.out.println("Infelismente voc� n�o pode entrar");
			}
		}
		
		*/
		double salario = 3300.0;

        if(salario < 2600.0) {
            System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir at� R$ 350");
        }
        if(salario < 3750.0) {
            System.out.println("A sua aliquota � de 22,5%");
            System.out.println("Voc� pode deduzir at� R$ 636");
        }
	}
}
