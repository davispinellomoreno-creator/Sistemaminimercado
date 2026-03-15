package com.minimercado.demo.Dto;

import com.minimercado.demo.Status.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MercadoDto {
    private String nome;
    private Double preco;
        private LocalDate dataValidade;
        private long id;
    private Status status;

    public MercadoDto() {
    }

}
