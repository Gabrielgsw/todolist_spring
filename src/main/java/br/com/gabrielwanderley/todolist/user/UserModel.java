package br.com.gabrielwanderley.todolist.user;

import lombok.Data;

@Data // utilizado para definir automaticamente os getters e setters
public class UserModel {

    private String username;
    private String name;
    private String password;

}
