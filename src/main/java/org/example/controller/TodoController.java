package org.example.controller;

import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("Create");
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne() {
        System.out.println("Read One");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll() {
        System.out.println("Read All");
        return null;
    }

    @PutMapping("{id}")
    public ResponseEntity<TodoResponse> update() {
        System.out.println("Update");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne() {
        System.out.println("Delete");
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll() {
        System.out.println("Delete All");
        return null;
    }


}
