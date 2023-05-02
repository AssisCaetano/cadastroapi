package com.dcl.cadastro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.cadastro.Model.Cargo;
import com.dcl.cadastro.Repository.CargoRepository;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRepository repository;

    @PostMapping
    public Cargo insert(@RequestBody Cargo cargo){

        Cargo result = repository.save(cargo);

        return result;
    }

    @GetMapping
    public List<Cargo>findAll(){

        List<Cargo> result = repository.findAll();

        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Cargo atulizaCargo(@RequestBody Cargo cargo){

        Cargo result = repository.save(cargo);

        return result;
    }

    @DeleteMapping("/{id}")
    public String deletarCargo(@PathVariable("id")String id){
       repository.deleteById(id); 
       return "Cargo deletado Com Sucesso!";
    }
    
}
