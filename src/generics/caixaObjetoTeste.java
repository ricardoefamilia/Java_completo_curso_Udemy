package generics;

public class caixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // converteu double -> Double
		
		Double coisaA = (Double) caixaA.abrir();
		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá"); // converteu double -> Double
		
		String coisaB = (String) caixaB.abrir();
		
		System.out.println(coisaB);
	}

}
