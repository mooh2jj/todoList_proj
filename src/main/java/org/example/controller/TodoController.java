package org.example.controller;

import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public ResponseEntity<TodoResponse> readOne() {
        System.out.println("Read One");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll() {
        System.out.println("Read All");
        return null;
    }

    public ResponseEntity<TodoResponse> update() {
        System.out.println("Update");
        return null;
    }
}
