package relatorio;

public class Alunos{
	private String matricula;
	private String nome;
	private String codigo;
	//35 aulas + matricula, nome e codigo
	private String aula[] = new String[38];


	//M�todos para o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	//M�todos para a matr�cula
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
	
	//M�todos para a aula
	public void setAula(String aula, int i) {
		this.aula[i] = aula;
	}
	public String getAula(int j) {
		return this.aula[j];
	}
	
	//M�todos para o codigo
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo() {
		return this.codigo;
	}

}
