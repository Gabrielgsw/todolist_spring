package br.com.gabrielwanderley.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 
 * ID
 * Usuario(ID_USUARIO)
 * Desricao
 * Titulo
 * Data de inicio
 * Data de termino
 * Prioridade
 */

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    @Column(length = 50) // delimitando o tamanho máximo de caracteres do title
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String prority;
    private UUID idUser;

    @CreationTimestamp // quando a tarefa for criada no db, será atribuido uma data
    private LocalDateTime createdAt;

}
