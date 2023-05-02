package com.dcl.cadastro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcl.cadastro.Model.Cargo;

public interface CargoRepository extends JpaRepository <Cargo, String>{
    
}
