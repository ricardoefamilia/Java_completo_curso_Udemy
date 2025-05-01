package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$1234,56
		 */
		
		Function<Produto, Double> preco = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> precoImposto = valor -> valor >= 2500 ? (valor * 1.085) : valor;
		UnaryOperator<Double> precoFrete = valor -> valor >= 3000 ? valor + 100 : valor + 50 ;
		UnaryOperator<Double> precoArredondado = valor -> Double.parseDouble(String.format("%.2f", valor));
		Function<Double, String> precoFormatado = valor -> ("R$ " + valor).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.10);

		String precoFinal = preco
				.andThen(precoImposto)
				.andThen(precoFrete)
				//.andThen(precoArredondado)
				.andThen(precoFormatado)
				.apply(p);
		System.out.println("Preço final: " + precoFinal);
	}

}
