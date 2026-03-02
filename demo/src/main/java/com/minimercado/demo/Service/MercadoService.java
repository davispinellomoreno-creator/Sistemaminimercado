package com.minimercado.demo.Service;


import com.minimercado.demo.Entidades.Produtos;
import com.minimercado.demo.Repository.MercadoRepository;


public class MercadoService {

    private final MercadoRepository repositorymercado;

    public MercadoService(MercadoRepository repositorymercado) {
        this.repositorymercado = repositorymercado;
    }

    public void salvarProduto(Produtos produto) {

        repositorymercado.saveAndFlush(produto);
    }

    public Produtos buscarProduto(Long id) {
        return repositorymercado.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Produto não encontrado")
                );

    }

    public void deletarProduto(Long id) {
        repositorymercado.deleteById(id);

    }

    public Produtos atualizarProdutosPorId(Long id, Produtos produto) {
        Produtos profutoEntity = repositorymercado.findById(id).
                orElseThrow(
                        () -> new RuntimeException("Produto não encontrado")
                );
        Produtos produtoAtualizado = Produtos.builder()
                .id(produto.getId() != null
                        ? produto.getId() : profutoEntity.getId())
                .nome((produto.getNome() != null ? produto.getNome() : profutoEntity.getNome())
                )

                .build();


        return repositorymercado.save(produto);
    }

}
