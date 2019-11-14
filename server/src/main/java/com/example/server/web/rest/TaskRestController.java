package com.example.server.web.rest;

import com.example.server.service.TaskService;
import com.example.server.web.response.TaskResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tasks")
public class TaskRestController {

    private final TaskService todoService;

    public TaskRestController(TaskService todoService) {
        this.todoService = todoService;
    }

    /*
     * TODO server-1
     * @CrossOrigin アノテーションで異なる Origin からのリクエストを許容する設定です。
     * origins 属性で許容する Origin を指定しています。
     */
    @GetMapping
    @CrossOrigin(origins = {"http://localhost:4200"})
    public List<TaskResponse> findAll() {
        return this.todoService.findAll().stream().map(todo -> new TaskResponse(todo)).collect(Collectors.toList());
    }
}
