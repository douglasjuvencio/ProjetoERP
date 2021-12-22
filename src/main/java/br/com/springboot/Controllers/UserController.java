package br.com.springboot.Controllers;

import br.com.springboot.Repositary.UserRepositary;
import br.com.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UserController {

    private List<User> users = new ArrayList();

    @Autowired // esse  comando insere todas as funcoes do repositario do jpa
    private UserRepositary userRepositary;

    //salva os usuarios
    @PostMapping("/salva")
    public User user(@RequestBody User user){
        return this.userRepositary.save(user);
    }

    //delete os usuarios[id
    @DeleteMapping("/deleta")
    @ResponseBody // comando traz uma resposta do corpo
    public ResponseEntity<String> delete (@RequestParam Long iduser){
        //o comando ResponseEntity traz todos os dados do banco de dados
        this.userRepositary.deleteById(iduser);
        return new ResponseEntity<String>("Usuario Deletado", HttpStatus.OK);
    }

    @PutMapping("/atualiza")
    @ResponseBody // comando traz uma resposta do corpo
    public ResponseEntity<User> atualiza (@RequestBody User user){
        User user1 = userRepositary.saveAndFlush(user);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }

    @GetMapping("/procuratodos")
    public List<User>  List(){
        return this.userRepositary.findAll() ;
    }

    @GetMapping("/procuramaiorque/{id}")
    public List<User>  procuramaiorque(@PathVariable("id") long id){
        return this.userRepositary.procuramaiorque(id);
    }

    @GetMapping("/procurapornome")
    @ResponseBody
    public  ResponseEntity<List<User> > procurapornome( @RequestParam(name = "nome") String nome){
        List<User> usuario  = userRepositary.procurapornome(nome.trim().toUpperCase());
        return new ResponseEntity<List<User>>(usuario,HttpStatus.OK);
    }

    @GetMapping("/procuraporid")
    public  ResponseEntity<User> procuraporid( @RequestParam(name = "id") long id){
        User usuario  = userRepositary.procuraporid(id);
        return new ResponseEntity<User>(usuario,HttpStatus.OK);
    }




}
