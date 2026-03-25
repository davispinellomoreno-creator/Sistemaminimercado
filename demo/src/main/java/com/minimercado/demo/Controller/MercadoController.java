package com.minimercado.demo.Controller;

import com.minimercado.demo.Dto.MercadoDto;
import com.minimercado.demo.Entidades.Produtos;
import com.minimercado.demo.Service.MercadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("/Mercado")
public class MercadoController {

    private final MercadoService serviceproduto;
    private final Produtos produto;


    public MercadoController(MercadoService serviceproduto, Produtos produto) {
        this.serviceproduto = serviceproduto;
        this.produto = produto;


    }


    @GetMapping("/{id}")
    public MercadoDto buscarProduto(@PathVariable Long id) {
        return serviceproduto.buscarProduto(id);
    }

    @PostMapping
    public MercadoDto salvarProduto(@RequestBody MercadoDto produto) {
        return serviceproduto.salvarProduto(produto);
    }

    @PutMapping("/{id}")
    public MercadoDto atualizarProduto(
            @PathVariable Long id,
            @RequestBody MercadoDto produto) {

        return serviceproduto.atualizarProdutosPorId(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        serviceproduto.deletarProduto(id);
    }
}
