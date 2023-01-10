package com.algaworks.festa.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Integer quantidadeAcompanhante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhante() {
		return quantidadeAcompanhante;
	}

	public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	

}
