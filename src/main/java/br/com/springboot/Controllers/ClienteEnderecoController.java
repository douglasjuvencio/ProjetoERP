package br.com.springboot.Controllers;

import br.com.springboot.Repositary.ClienteEnderecoRepositary;
import br.com.springboot.model.Cliente;
import br.com.springboot.model.ClienteEndereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes/endereco")
public class ClienteEnderecoController {


    @Autowired
    private  ClienteEnderecoRepositary  clienteenderecorepositary;

    @PostMapping("/")
    public ClienteEndereco clienteendereco(@RequestBody ClienteEndereco clienteendereco){
        return this.clienteenderecorepositary.save(clienteendereco);
    }


}
