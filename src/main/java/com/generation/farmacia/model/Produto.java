package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Nome do Produto não pode ser Nulo")
	@Size(max = 255)
	private String nome;

	@NotNull(message = "Preço do Produto não pode ser Nulo.")
	private float preco;


	@NotNull(message = "Preço de entrega não pode ser Nulo.")
	private float entrega;

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getEntrega() {
		return entrega;
	}

	public void setEntrega(float entrega) {
		this.entrega = entrega;
	}

}
