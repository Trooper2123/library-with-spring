package com.mylibrary.livraria.user;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")

public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "teste@teste.com"
                ,"12345678901","123456789","123");
                return ResponseEntity.ok().body(u);
    }


}
