package com.minimercado.demo.Controller;

import com.minimercado.demo.Entidades.Produtos;
import com.minimercado.demo.Service.MercadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    public ResponseEntity<Produtos> buscarProduto (@RequestParam Long id){
     return ResponseEntity.ok(serviceproduto.buscarProduto(id));
    }
}
