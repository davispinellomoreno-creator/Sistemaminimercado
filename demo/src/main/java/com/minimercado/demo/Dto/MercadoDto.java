package com.minimercado.demo.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MercadoDto {
    private String nome;
    private Double preco;
        private LocalDate dataValidade;

    public MercadoDto() {
    }

}
