package com.minimercado.demo.Service;

import com.minimercado.demo.Repository.MercadoRepository;

public class MercadoService {

    private final MercadoRepository repositorymercado;

    public MercadoService(MercadoRepository repositorymercado) {
        this.repositorymercado = repositorymercado;
    }
}
