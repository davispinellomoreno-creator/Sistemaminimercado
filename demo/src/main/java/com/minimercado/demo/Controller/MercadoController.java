package com.minimercado.demo.Controller;

import com.minimercado.demo.Service.MercadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mercado")
public class MercadoController {

    private final MercadoService serviceproduto;


    public MercadoController(MercadoService serviceproduto) {
        this.serviceproduto = serviceproduto;
    }
}
