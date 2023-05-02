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

import com.dcl.cadastro.Model.Cliente;
import com.dcl.cadastro.Repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository cr;

    //Cadastrando um Cliente
    @PostMapping
    public Cliente insert(@RequestBody Cliente cliente) {

        Cliente result = cr.save(cliente);

        return result;
    }
    //Listando todos os cliente cadastrado no banco
    @GetMapping
    public List<Cliente> findAll(){

        List<Cliente> result = cr.findAll();

        return result;
    }

    //Pesquisando um cliente passando o ID pela url
    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable String id){
        Cliente result = cr.findById(id).get();
        
        return result;
    }

    @RequestMapping(value =  "/{id}", method = RequestMethod.PUT)
    public Cliente atualizaCliente(@RequestBody Cliente cliente){

        return cr.save(cliente);
    }

    //Deletando um cliente pelo seu ID 
   @DeleteMapping("/{id}")
   public String deleteById(@PathVariable("id")String id){

    cr.deleteById(id);

   return "Cliente deletado com Sucesso";
    
   }

}
