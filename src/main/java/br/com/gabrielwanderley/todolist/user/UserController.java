package br.com.gabrielwanderley.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired // notação para o spring gerenciar o userRepository/autoinicializar
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
        // @RequestBody -> para indicar ao spring que o argumento faz parte do body
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null) {
            System.out.println("Usuário já existente");
            return null;
        }
        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
}
