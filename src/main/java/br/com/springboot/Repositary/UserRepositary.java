package br.com.springboot.Repositary;

import br.com.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepositary extends JpaRepository<User, Long> {
    @Query("SELECT u from User u where u.id > :id")
    public List<User> procuramaiorque(@Param("id") Long id);

    @Query("SELECT u from User u where u.nome like %?1%")
    public List<User> procurapornome(@Param("nome") String nome);

}
