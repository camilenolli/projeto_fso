package br.univille.projetofso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projetofso.entity.Produto;

@Repository
public interface ProdutoRepository 
    extends JpaRepository<Produto,Long> {
    
}
