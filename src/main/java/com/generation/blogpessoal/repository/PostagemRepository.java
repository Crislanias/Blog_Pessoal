package com.generation.blogpessoal.repository;
	
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.generation.blogpessoal.model.Postagem;


	@Repository
	public interface PostagemRepository extends JpaRepository< Postagem, Long> {
	public abstract List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

	
		}
		
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo ) {
	return ResponseeEntity.ok(postagemRepository.findAllbyTituloContainingIgnoreCase(titulo));

	}

	


	
	
	
	
	
	
