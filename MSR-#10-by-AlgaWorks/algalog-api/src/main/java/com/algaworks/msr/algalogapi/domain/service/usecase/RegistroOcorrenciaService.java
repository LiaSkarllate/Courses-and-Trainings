package com.algaworks.msr.algalogapi.domain.service.usecase;

import javax.transaction.Transactional;

import com.algaworks.msr.algalogapi.domain.model.Entrega;
import com.algaworks.msr.algalogapi.domain.model.Ocorrencia;
import com.algaworks.msr.algalogapi.domain.service.EntregaService;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {
    //Métodos:

    private EntregaService entregaService;

    @Transactional
    public Ocorrencia registrar(Long entregaId, String descricao) {
        Entrega entrega = entregaService.buscar(entregaId);
        return entrega.registrarOcorrencia(descricao);
    }
}
