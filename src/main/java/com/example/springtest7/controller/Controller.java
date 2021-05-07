package com.example.springtest7.controller;

import com.example.springtest7.entity.Member;
import com.example.springtest7.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping ("temp")
    public ResponseEntity temp(){
        System.out.println("access temp");

        return new ResponseEntity<>("service.login(member)", HttpStatus.OK);
    }



//
//    @GetMapping ("login")
//    public ResponseEntity login(@RequestBody Member member){
//        System.out.println("access Login");
//
//        return new ResponseEntity<>(service.login(member), HttpStatus.OK);
//    }
//
//    @GetMapping("join")
//    public ResponseEntity join(@RequestBody Member member){
//
//        System.out.println("access Join");
//
//        return new ResponseEntity<>(service.join(member), HttpStatus.OK);
//    }

}
