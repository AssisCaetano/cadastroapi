package com.dcl.cadastro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcl.cadastro.Model.Cliente;

public interface ClienteRepository extends JpaRepository < Cliente, String >{

    
    
}
