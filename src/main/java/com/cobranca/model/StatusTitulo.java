package com.cobranca.model;

public enum StatusTitulo {
	
	PENDENTE("Pendente"),
	RECEBIDO("recebido");

	private String descricao;
	
	StatusTitulo(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

