
public class TratandoExcecoesQuaisquer {
	
	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	        
	        try {
	        	
		        metodo1();
	        }
	        
	        catch(Exception ex) {
	        	String msg = ex.getMessage();
	        	System.out.println("Tratando qualquer Excecão " + msg);
	        }
	        
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");	        

	        Conta c = new Conta();
	        c.sacar();
	    }
}
