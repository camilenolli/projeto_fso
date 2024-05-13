package br.univille.projetofso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projetofso.entity.Cliente;
import br.univille.projetofso.repository.ClienteRepository;
import br.univille.projetofso.service.ClienteService;

@Service
public class ClienteServiceImpl 
    implements ClienteService{
        
    @Autowired   
    private ClienteRepository repository;

    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public Cliente getById(long Id) {
        return repository.getById(Id);
    }

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente delete(long id) {
        var cliente = getById(id);
        repository.deleteById(id);
        return cliente;
    }

}
    

