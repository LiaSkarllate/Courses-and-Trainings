package com.algaworks.msr.algalogapi.api.controller;

//Imports:
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.algaworks.msr.algalogapi.domain.model.Cliente;
import com.algaworks.msr.algalogapi.domain.repository.ClienteRepository;
import com.algaworks.msr.algalogapi.domain.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    //Attributes:
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteService clienteService;

    //Methods:
    @GetMapping
    public List<Cliente> buscar() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
        Optional<Cliente> objectFromRepository = clienteRepository.findById(id);

        if(objectFromRepository.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(objectFromRepository.get());
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<Cliente> incluir(@Valid @RequestBody Cliente objectFromBody) {
        Cliente objectFromRepository = clienteService.salvar(objectFromBody);
        return ResponseEntity.status(HttpStatus.CREATED).body(objectFromRepository);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @Valid @RequestBody Cliente objectFromBody) {
        if(!clienteRepository.existsById(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        objectFromBody.setId(id);
        Cliente objectFromRepository = clienteService.salvar(objectFromBody);
        return ResponseEntity.status(HttpStatus.OK).body(objectFromRepository);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        if(!clienteRepository.existsById(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        clienteService.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}