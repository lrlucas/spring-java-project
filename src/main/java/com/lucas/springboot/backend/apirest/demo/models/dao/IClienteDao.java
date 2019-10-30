package com.lucas.springboot.backend.apirest.demo.models.dao;

import com.lucas.springboot.backend.apirest.demo.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
