package br.com.springboot.Repositary;

import br.com.springboot.model.Cidade;
import br.com.springboot.model.ClienteEndereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteEnderecoRepositary extends JpaRepository<ClienteEndereco, Long> {
}
