public class TestaCondicional2 {

	public static void main(String[] args) {

	    String var = "ABC";

	    try {

	Integer i = new Integer(var);

	System.out.println(String.format("A variav�l %s vale %s", i ,i ));

	    } catch (NumberFormatException e) {

	System.out.println(String.format("N�o foi poss�vel atribuir a vari�vel %s para um inteiro. Mensagem de erro: %s ", var, e.getMessage()));

	    }

	}

    }

