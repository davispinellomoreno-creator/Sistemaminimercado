package com.minimercado.demo.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Cadastro_Produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "nome",unique = true)
    private String nome;

    @Column(name = "nome",unique = true)
    private int validade;







}
