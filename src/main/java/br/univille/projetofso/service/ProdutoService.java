package br.univille.projetofso.service;

import java.util.List;
import br.univille.projetofso.entity.Produto;

public interface ProdutoService {
    void save (Produto produto);
    Produto getById (long Id);
    List<Produto> getAll();
    Produto delete(long id);
    
}