package br.com.springboot.Controllers;

import br.com.springboot.Repositary.ClienteEnderecoRepositary;
import br.com.springboot.model.Cidade;
import br.com.springboot.model.ClienteEndereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes/endereco")
public class ClienteEnderecoController {
    @Autowired
    private  ClienteEnderecoRepositary  clienteenderecorepositary;

    @GetMapping("/{id}")
    public Optional<ClienteEndereco>  clienteEndereco(@PathVariable("id") long id){
        return this.clienteenderecorepositary.findById(id);
    }

    @PostMapping("/")
    public ClienteEndereco clienteendereco(@RequestBody ClienteEndereco clienteendereco){
        return this.clienteenderecorepositary.save(clienteendereco);
    }
}
