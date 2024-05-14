package br.univille.projetofso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projetofso.entity.Venda;

@Repository
public interface VendaRepository 
    extends JpaRepository<Venda,Long> {
    
}
