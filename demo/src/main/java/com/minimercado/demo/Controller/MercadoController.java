package com.minimercado.demo.Controller;

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

    @GetMapping
    public ResponseEntity<Produtos> buscarProduto(@RequestParam Long id) {
        return ResponseEntity.ok(serviceproduto.buscarProduto(id));
    }

    @PostMapping
    public ResponseEntity<Void> salvarProduto(@RequestBody Produtos produto) {
        serviceproduto.salvarProduto(produto);

        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Produtos> atualizarProduto(@RequestBody Produtos produto, Long id) {
        serviceproduto.atualizarProdutosPorId(id, produto);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Produtos> atualizarProduto(@RequestParam Long id) {
        serviceproduto.deletarProduto(id);

        return ResponseEntity.ok().build();
    }
}
