package dev.fujioka.pedrobarros.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Integer id;

    private String descricao;

    private String cor;



}
