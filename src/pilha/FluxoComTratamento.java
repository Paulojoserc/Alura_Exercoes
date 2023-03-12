package pilha;

public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
			metodo1();
		}catch(ArithmeticException | NullPointerException ex) {
			//getMessage trais qual é erro 
			String msg = ex.getMessage();
			System.out.println("Exception "+ msg);
			
			//trais a pilha por onde o metado passou
			ex.printStackTrace();
		}/*catch(NullPointerException ex) {
			//getMessage trais qual é erro 
			String msg = ex.getMessage();
			System.out.println("NullPointerException"+ msg);
		}
		*/System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		//try {
			metodo2();
		/*}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}*/
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		//	try {
				@SuppressWarnings("unused")
				int a= i /0;
				//Conta c = null;
				//c.deposita();
				
			/*}catch(ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}*/
		}
		System.out.println("Fim do metodo2");
	} 
}
