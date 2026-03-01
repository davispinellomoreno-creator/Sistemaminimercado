package com.minimercado.demo.Repository;

import com.minimercado.demo.Entidades.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoRepository extends JpaRepository <Produtos, Long > {
}
