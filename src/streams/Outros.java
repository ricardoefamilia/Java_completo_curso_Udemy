package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Gabi", 10);
		Aluno a6 = new Aluno("Gabi", 10);
		Aluno a7 = new Aluno("Gabi", 10);
		Aluno a8 = new Aluno("Gui", 10);

		List<Aluno> alunos = 
			Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		//distinct - para não pegar valores duplicados
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		//Skip/Limit - paginação no stream 
		//skip - pula uma qtd de elementos
		//limit - limita a qtd de elementos
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		//takeWhile - pega elementos enquanto estiver numa determinada condição
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		
	}
}
