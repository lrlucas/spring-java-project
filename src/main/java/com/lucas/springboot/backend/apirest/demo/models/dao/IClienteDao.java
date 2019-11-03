package com.lucas.springboot.backend.apirest.demo.models.dao;

import com.lucas.springboot.backend.apirest.demo.models.entity.Cliente;
import com.lucas.springboot.backend.apirest.demo.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    public List<Region> findAllRegiones();
}
