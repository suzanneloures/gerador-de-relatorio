package relatorio;

public class Cabecalho {
	public String departamento;
	public String disciplina;
	public String periodo_letivo;
	public String turma;
	public String carga_hoarria;
	
	//M�todos para o departamento
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento() {
		return this.departamento;
	}

	//M�todos para a disciplina
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	public String getDisciplina() {
		return this.disciplina;
	}

	//M�todos para o periodoletivo
	public void setPeriodo_letivo(String periodo_letivo){
		this.periodo_letivo = periodo_letivo;
	}
	public String getPeriodo_letivo() {
		return this.periodo_letivo;
	}	
	
	//M�todos para a turma
	public void setTurma(String turma){
		this.turma = turma;
	}
	public String getTurma() {
		return this.turma;
	}	
	
	//M�todos para a carga hor�ria
	public void setCarga_horaria(String carga_horaria){
		this.carga_hoarria = carga_horaria;
	}
	public String getCarga_horaria() {
		return this.carga_hoarria;
	}	

}