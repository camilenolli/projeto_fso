package br.univille.projetofso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofso.entity.Venda;
import br.univille.projetofso.service.VendaService;

@Controller
@RequestMapping("/vendas")
public class VendaController {
    
    @Autowired
    private VendaService service;

    @GetMapping
    public ModelAndView index(){
        var listaVendas = service.getAll();

        return new ModelAndView("venda/index","listaVendas",listaVendas);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var venda = new Venda();
        return new ModelAndView("venda/form","venda", venda);
    }
    @PostMapping()
    public ModelAndView save(Venda venda) {
        service.save(venda);
        return new ModelAndView("redirect:/vendas");

    }

    @GetMapping("alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var venda = service.getById(id);
        return new ModelAndView("venda/form", "venda", venda);
    }


    @GetMapping("delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/vendas");

    }
}