package com.generation.blogpessoal.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
   
 public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}

}
