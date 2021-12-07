package br.com.springboot.Repositary;

import br.com.springboot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepositary extends JpaRepository<Cliente, Long> {
    @Query("SELECT u from Cliente u where u.id > :id")
    public List<Cliente> findAllMorethan(@Param("id") Long id);

    //busca pelo nome do cliente
    public List<Cliente> findByNomeIgnoreCase  (String nome);

}
