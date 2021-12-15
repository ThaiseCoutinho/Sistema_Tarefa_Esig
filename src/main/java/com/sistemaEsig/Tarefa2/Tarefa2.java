package com.sistemaEsig.Tarefa2;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 
@Entity 
public class Tarefa2 {
	
	
	
	@Id 
	private Long id;
	private String titulo;
	private String descricao;
	private String responsavel;
	private String prioridade;
	private String deadline;
	private String situacao;
	
	
	
	public Tarefa2() {}
	
	public Tarefa2(long id, String titulo, String descricao, String responsavel, String prioridade, String deadline,
			String situacao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.prioridade = prioridade;
		this.deadline = deadline;
		this.situacao = situacao;
		
	} 
	
	public void setSituacao(String situcao) {
        this.situacao = situacao;
    }
	
	public void setId(long id) {
        this.id = id;
    }


}
