
public abstract class LiderMovimento implements Funcionario {

	
	private String nome;
	private String cpf;
	private String evento;
	private int matricula;
	
	
	
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	public String getNome() {
		return nome;
	}
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public int setMatricula(int matricula) {
		return this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
}
