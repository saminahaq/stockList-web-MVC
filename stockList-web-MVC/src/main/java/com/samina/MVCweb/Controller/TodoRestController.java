package com.samina.MVCweb.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samina.MVCweb.Model.Todo;
import com.samina.MVCweb.Service.TodoService;

@RestController
public class TodoRestController {
    @Autowired
    private TodoService service;

    @RequestMapping(value = "/rest/todos", method = RequestMethod.GET)
    public List<Todo> listAllTodos() {
        List<Todo> users = service.retrieveTodos("samina");
        return users;
    }

}
