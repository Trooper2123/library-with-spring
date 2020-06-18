package com.mylibrary.livraria.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.mylibrary.livraria.user.User;
import com.mylibrary.livraria.user.UserService;

@RestController
@RequestMapping(value ="/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
                return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/`{id}")
    public ResponseEntity<User> findByID(@PathVariable Long id){
        User object = service.findById(id);
        return ResponseEntity.ok().body(object);
    }

}
