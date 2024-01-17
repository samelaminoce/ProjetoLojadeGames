package com.generation.lojadegames.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name ="tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotBlank(message = "O atributo título é Obrigatório!")
    @Size(min = 10, max = 100, message = "O atributo tipo deve conter no máximo 1000 caracteres")
	private String titulo;
	
    @NotBlank(message = "O atributo Descrição é Obrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo Descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
    private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}


