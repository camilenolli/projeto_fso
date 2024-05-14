package br.univille.projetofso.service;

import java.util.List;
import br.univille.projetofso.entity.Venda;

public interface VendaService {
    void save (Venda venda);
    Venda getById (long Id);
    List<Venda> getAll();
    Venda delete(long id);
    
}
