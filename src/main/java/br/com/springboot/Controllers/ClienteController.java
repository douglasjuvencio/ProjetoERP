package br.com.springboot.Controllers;


import br.com.springboot.Repositary.ClienteRepositary;
import br.com.springboot.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")

public class ClienteController {

    private List<Cliente> listacliente = new ArrayList();

    @Autowired
    private ClienteRepositary clienteRepositary;

    @GetMapping("/{id}")
    public Optional<Cliente> cliente(@PathVariable("id") long id){
        return this.clienteRepositary.findById(id) ;
    }

    @PostMapping("/")
    public Cliente cliente(@RequestBody Cliente cliente){
        return this.clienteRepositary.save(cliente);
    }

    @GetMapping("buscanome/{nome}")
    public List<Cliente> buscanome(@PathVariable("nome") String nome){
        return this.clienteRepositary.findByNomeIgnoreCase(nome) ;
    }

}
