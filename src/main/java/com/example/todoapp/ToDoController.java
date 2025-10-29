package com.example.todoapp;

import com.example.todoapp.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @PostMapping("/create")
    ResponseEntity<Todo> CreateUser(@RequestBody Todo todo){
        return new ResponseEntity<>(toDoService.createtodo(todo), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public String home() {
        return "Welcome to ToDo API!";
    }

}
