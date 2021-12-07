package br.com.springboot.Controllers;

import br.com.springboot.Repositary.UserRepositary;
import br.com.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {

    private List<User> users = new ArrayList();

    @Autowired
    private UserRepositary userRepositary;


    @GetMapping("/{id}")
    public Optional<User> user(@PathVariable("id") long id){
        return this.userRepositary.findById(id) ;
    }

    @PostMapping("/")
    public User user(@RequestBody User user){

        return this.userRepositary.save(user);
    }

    @GetMapping("/list")
    public List<User>  List(){
        return this.userRepositary.findAll() ;
    }

    @GetMapping("/list/{id}")
    public List<User>  listMorethan(@PathVariable("id") long id){
        return this.userRepositary.findAllMorethan(id);
    }

}
