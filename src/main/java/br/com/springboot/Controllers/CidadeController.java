package br.com.springboot.Controllers;

import br.com.springboot.Repositary.CidadeRepositary;
import br.com.springboot.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CidadeController {
    private List<Cidade> listacliente = new ArrayList();

    @Autowired
    private CidadeRepositary cidadeRepositary;

    @GetMapping("/{id}")
    public Optional<Cidade> cidade(@PathVariable("id") long id){
        return this.cidadeRepositary.findById(id);
    }

    @PostMapping("/")
    public Cidade cidade(@RequestBody Cidade cidade){
        return this.cidadeRepositary.save(cidade);
    }
}
