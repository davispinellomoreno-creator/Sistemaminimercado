package com.minimercado.demo.Service;


import com.minimercado.demo.Dto.MercadoDto;
import com.minimercado.demo.Entidades.Produtos;
import com.minimercado.demo.Repository.MercadoRepository;


public class MercadoService {

    private final MercadoRepository repositorymercado;

    public MercadoService(MercadoRepository repositorymercado) {
        this.repositorymercado = repositorymercado;
    }

    public MercadoDto salvarProduto(MercadoDto produtoDto) {

        Produtos produto = new Produtos();
        produto.setNome(produtoDto.getNome());
        produto.setPreco(produtoDto.getPreco());
        produto.setStatus(produtoDto.getStatus());



        Produtos salvo = repositorymercado.save(produto);

        MercadoDto resposta = new MercadoDto();
        resposta.setId(salvo.getId());
        resposta.setNome(salvo.getNome());
        resposta.setPreco(salvo.getPreco());
        resposta.setStatus(salvo.getStatus());

        return resposta;
    }

    public MercadoDto buscarProduto(Long id) {

        Produtos produto = repositorymercado.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        MercadoDto dto = new MercadoDto();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setPreco(produto.getPreco());
        dto.setStatus(produto.getStatus());

        return dto;
    }

    public void deletarProduto(Long id) {
        repositorymercado.deleteById(id);
    }


    public MercadoDto atualizarProdutosPorId(Long id, MercadoDto produtoDto) {

        Produtos produtoEntity = repositorymercado.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produtoEntity.setNome(produtoDto.getNome());
        produtoEntity.setPreco(produtoDto.getPreco());

        Produtos produtoSalvo = repositorymercado.save(produtoEntity);

        MercadoDto dto = new MercadoDto();
        dto.setId(produtoSalvo.getId());
        dto.setNome(produtoSalvo.getNome());
        dto.setPreco(produtoSalvo.getPreco());
        dto.setStatus(produtoSalvo.getStatus());

        return dto;
    }

}
