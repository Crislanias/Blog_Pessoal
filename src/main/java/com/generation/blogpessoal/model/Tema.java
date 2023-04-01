package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
	@Table(name = "tb_temass")
	public class Tema {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotNull(message = "O Atributo Descrição é obrigatório")
		private String descricao;

		 @ManyToOne
		   
		 @JsonIgnoreProperties("postagem")
		    private Tema tema;

		private String titulo;

		private String texto;

		private LocalDateTime data;

		
		 public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTitulo() {
				return this.titulo;
			}

			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}

			public String getTexto() {
				return this.getTexto();
			}

			public void setTexto(String texto) {
				this.texto = texto;
			}

			public LocalDateTime getData() {
				return this.getData();
			}

			public void setData(LocalDateTime data) {
				this.data = data;
			}

			public Tema getTema() {
				return tema;
			}

			public void setTema(Tema tema) {
				this.tema = tema;
			}

		}
	
	

