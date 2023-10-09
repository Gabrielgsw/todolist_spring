package br.com.gabrielwanderley.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        // @RequestBody -> para indicar ao spring que o argumento faz parte do body
        System.out.println(userModel.name);

    }
}
