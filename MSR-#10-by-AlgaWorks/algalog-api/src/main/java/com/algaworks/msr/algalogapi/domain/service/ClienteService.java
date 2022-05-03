package com.algaworks.msr.algalogapi.domain.service;

import com.algaworks.msr.algalogapi.domain.exception.NegocioException;
import com.algaworks.msr.algalogapi.domain.model.Cliente;
import com.algaworks.msr.algalogapi.domain.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {
    //Atributos:
    @Autowired
    private ClienteRepository clienteRepository;

    //Métodos:
    public Cliente buscar(Long id) {
        Cliente clienteBanco = clienteRepository.findById(id).orElse(null);
                                            
        if(clienteBanco == null){
            throw new NegocioException("O cliente informando não foi encontrado.");
        }

        return clienteBanco;
    }

    @Transactional
    public Cliente salvar(Cliente cliente) {
        Cliente clienteBanco = this.clienteRepository.findByEmail(cliente.getEmail()).orElse(null);
        
        if(!(clienteBanco == null) && !clienteBanco.equals(cliente)){
            throw new NegocioException("O e-mail informado já está em uso por outro cliente.");
        }                       

        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }
}
