package dev.fujioka.pedrobarros.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String cpf;



}
