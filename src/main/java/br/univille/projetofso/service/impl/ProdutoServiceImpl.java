package br.univille.projetofso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projetofso.entity.Produto;
import br.univille.projetofso.repository.ProdutoRepository;
import br.univille.projetofso.service.ProdutoService;

@Service
public class ProdutoServiceImpl 
    implements ProdutoService{
        
    @Autowired   
    private ProdutoRepository repository;

    @Override
    public void save(Produto produto) {
        repository.save(produto);
    }

    @Override
    public Produto getById(long Id) {
        return repository.getById(Id);
    }

    @Override
    public List<Produto> getAll() {
        return repository.findAll();
    }

    @Override
    public Produto delete(long id) {
        var produto = getById(id);
        repository.deleteById(id);
        return produto;
    }

}
    

