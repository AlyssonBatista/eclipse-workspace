public class TestaCondicional2 {

	public static void main(String[] args) {

	    String var = "ABC";

	    try {

	Integer i = new Integer(var);

	System.out.println(String.format("A variavél %s vale %s", i ,i ));

	    } catch (NumberFormatException e) {

	System.out.println(String.format("Não foi possível atribuir a variável %s para um inteiro. Mensagem de erro: %s ", var, e.getMessage()));

	    }

	}

    }

