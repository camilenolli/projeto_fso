package br.univille.projetofso.service;

import java.util.List;
import br.univille.projetofso.entity.Cliente;

public interface ClienteService {
    void save (Cliente cliente);
    Cliente getById (long Id);
    List<Cliente> getAll();
    Cliente delete(long id);
    
}
