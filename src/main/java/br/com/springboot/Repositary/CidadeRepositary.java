package br.com.springboot.Repositary;

import br.com.springboot.model.Cidade;
import br.com.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CidadeRepositary extends JpaRepository<Cidade, Long> {
}
