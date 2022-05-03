package com.algaworks.msr.algalogapi.domain.service;

import com.algaworks.msr.algalogapi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.msr.algalogapi.domain.model.Entrega;
import com.algaworks.msr.algalogapi.domain.repository.EntregaRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EntregaService {
    //Atributos:
    EntregaRepository entregaRepository;

    public Entrega buscar(Long id) {
        Entrega entregaBanco = entregaRepository.findById(id).orElse(null);

        if(entregaBanco == null){
            throw new EntidadeNaoEncontradaException("A entrega informada não foi encontrada.");
        }

        return entregaBanco;
    }
}
