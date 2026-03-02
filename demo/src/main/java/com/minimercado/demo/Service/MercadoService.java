package com.minimercado.demo.Service;


import com.minimercado.demo.Entidades.Produtos;
import com.minimercado.demo.Repository.MercadoRepository;

public class MercadoService {

    private final MercadoRepository repositorymercado;

    public MercadoService(MercadoRepository repositorymercado) {
        this.repositorymercado = repositorymercado;
    }
    public void salvarProduto(Produtos produto){

        repositorymercado.saveAndFlush(produto);
    }

    public void buscarProduto(Long id){
        repositorymercado.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Produto não encontrado")
                );

    }

}
