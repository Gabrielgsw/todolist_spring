package br.com.gabrielwanderley.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // utilizado para definir automaticamente os getters e setters
@Entity(name = "tb_users") // definindo os elementos da classe UserModel como uma tabela com o nome
                           // tb_users
public class UserModel {
    // Definindo um UUID,que é uma sequencia de numeros e letras, como chave
    // primária
    @Id // Notação para denotar uma chave primária como id
    @GeneratedValue(generator = "UUID") // definindo um valor aleatório do tipo UUID
    private UUID id;

    @Column(unique = true) // verifica e define como unico determinado valor, no caso, username
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // notação para saber a data em que determinado dado foi inserido
    private LocalDateTime createdAt;

}
