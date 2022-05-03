package com.algaworks.msr.algalogapi.domain.service.usecase;

//Importações:
import com.algaworks.msr.algalogapi.domain.model.Cliente;

import com.algaworks.msr.algalogapi.domain.model.Entrega;
import com.algaworks.msr.algalogapi.domain.model.Situacao;
import com.algaworks.msr.algalogapi.domain.repository.EntregaRepository;
import com.algaworks.msr.algalogapi.domain.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import javax.transaction.Transactional;

@Service
public class SolicitacaoEntregaService {
    //Atributos:
    @Autowired
    private EntregaRepository entregaRepository;

    @Autowired
    private ClienteService clienteService;

    //Métodos:
    @Transactional 
    public Entrega solicitar(Entrega entrega) {
        Cliente clienteBanco = clienteService.buscar(entrega.getCliente().getId());

        entrega.setCliente(clienteBanco);
        entrega.setSituacao(Situacao.PENDENTE);
        entrega.setDataPedido(OffsetDateTime.now());

        return this.entregaRepository.save(entrega);
    }
}