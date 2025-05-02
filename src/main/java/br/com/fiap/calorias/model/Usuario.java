package br.com.fiap.calorias.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_usuarios")
@Getter
@Setter
@NoArgsConstructor //criação do construtor default
@AllArgsConstructor //criação do const. com todos atribuos da classe usuario
@EqualsAndHashCode // criação metodos EQUALS e HASHCODE
public class Usuario {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,//define que é uma sequencia
            generator = "SEQ_USUARIOS")
    @SequenceGenerator(name = "SEQ_USUARIOS", // define o nome da seq.
            sequenceName = "SEQ_USUARIOS",
            allocationSize = 1) // chache da seq.
    @Column(name = "usuario_id")
    private Long usuarioId;

    private String nome;
    private String email;
    private String senha;
}







