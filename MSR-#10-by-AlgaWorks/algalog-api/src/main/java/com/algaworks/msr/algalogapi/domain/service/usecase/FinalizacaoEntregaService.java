package com.algaworks.msr.algalogapi.domain.service.usecase;

import javax.transaction.Transactional;

import com.algaworks.msr.algalogapi.domain.exception.NegocioException;
import com.algaworks.msr.algalogapi.domain.model.Entrega;
import com.algaworks.msr.algalogapi.domain.model.Situacao;
import com.algaworks.msr.algalogapi.domain.repository.EntregaRepository;
import com.algaworks.msr.algalogapi.domain.service.EntregaService;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
    private EntregaService entregaService;
    private EntregaRepository entregaRepository;
    
    @Transactional
    public void finalizar(Long entregaId){
        Entrega entrega = entregaService.buscar(entregaId);

        entrega.finalizar();
        entregaRepository.save(entrega);

    }   
}
