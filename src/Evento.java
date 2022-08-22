
public  class Evento implements Curso {
	
	private String nomeEvento;
	private String nomeDesafio;
	private String duvidas;
	private String aluno;
	private String nomeCurso;
	
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getNomeDesafio() {
		return nomeDesafio;
	}

	public void setNomeDesafio(String nomeDesafio) {
		this.nomeDesafio = nomeDesafio;
	}

	public String getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(String duvidas) {
		this.duvidas = duvidas;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String string) {
		this.aluno = string;
	}

	public Evento (String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	@Override
	public String setNomeCurso(String nomeCurso) {
		return this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	
}
