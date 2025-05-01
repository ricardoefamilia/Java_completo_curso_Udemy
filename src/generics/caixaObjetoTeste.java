package generics;

public class caixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3); // converteu double -> Double
		
		Double coisaA = (Double) caixaA.abrir();
		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguardar("Olá"); // converteu double -> Double
		
		String coisaB = (String) caixaB.abrir();
		
		System.out.println(coisaB);
	}

}
