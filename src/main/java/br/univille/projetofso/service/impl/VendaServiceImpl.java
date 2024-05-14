package br.univille.projetofso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projetofso.entity.Venda;
import br.univille.projetofso.repository.VendaRepository;
import br.univille.projetofso.service.VendaService;

@Service
public class VendaServiceImpl 
    implements VendaService{
        
    @Autowired   
    private VendaRepository repository;

    @Override
    public void save(Venda venda) {
        repository.save(venda);
    }

    @Override
    public Venda getById(long Id) {
        return repository.getById(Id);
    }

    @Override
    public List<Venda> getAll() {
        return repository.findAll();
    }

    @Override
    public Venda delete(long id) {
        var venda = getById(id);
        repository.deleteById(id);
        return venda;
    }

}
    

