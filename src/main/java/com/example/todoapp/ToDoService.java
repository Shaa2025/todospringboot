package com.example.todoapp;

import com.example.todoapp.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
@Autowired
    private ToDoRepository toDoRepository;
public Todo createtodo(Todo todo){
    return toDoRepository.save(todo);
}
}
