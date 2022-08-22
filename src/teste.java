
public class teste {

	
	public static void main(String[] args) {
		
		String evento = "Abstracao com java";
		
		Evento ev = new Evento (evento);
		ev.setNomeEvento(evento);
		ev.setNomeCurso("Back-end - Java e orientação a objetos básico");
		ev.setNomeDesafio("Teste de abstracao relacional");
		ev.setDuvidas("Pode digitar suas duvidas aqui");
		
		
		Mentores l1 = new Mentores();
		l1.setNome("Ursula K. Le Guin");
		l1.setMatricula(123);
		l1.setEvento(evento);
		l1.setCpf("8648646");
		l1.setCompartilharExp("Aqui tem algo interessante para estudar");
		l1.setDuvidaParaOrganizadores("Duvidas sobre o numero de matricula do aluno");
		l1.setMinistrarEvento(evento);
		l1.setSolucao("A solucao para o problema desenvolvido era X");
		
		
		Organizadores o1 = new Organizadores();
		o1.setNome("Frank Herbert");
		o1.setMatricula(321);
		o1.setCpf("123.654.789-10");
		o1.setEvento(evento);
	    o1.getDuvidas();
		
		
		Aprendizes a1 = new Aprendizes();
		a1.setNome("H. G. Wells");
		a1.setCpf("123654456465");
		a1.setDuvidas("Tenho uma duvida sobre throws");
		a1.setParticiparEvento(evento);
		ev.setAluno(a1.getNome());
		a1.setCompartilharResultados("Hoje aprendi sobre exceptions!");
		
		
		
		
		System.out.println("O aluno do evento " + ev.getNomeEvento() + " se chama " + ev.getAluno() + ". O desafio se chama: " + ev.getNomeDesafio());
		System.out.println();
		System.out.println("Ola aluno " + ev.getAluno() + ". Sua mentora será " + l1.getNome() + ", Matricula " + l1.getMatricula() + " . Voce podera tirar duvidas tecnicas com ela");
		System.out.println();
		System.out.println("O mentor " + o1.getNome() + " tambem respondera suas duvidas gerais sobre o movimento");
		System.out.println();
	
		System.out.println(a1.getDuvidas());
		l1.setDuvidasAlunos("A resposta para essa duvida esta no video anterior, " + a1.getNome());
		System.out.println(l1.getDuvidasAlunos());
		System.out.println();
		System.out.println("Boa tarde a todos. Quem fala é " + l1.getNome() + ". " + l1.getCompartilharExp());
		
	
		
		
		
				
	}
}
