package com.algaworks.msr.algalogapi.api.controller;

import java.util.List;

import javax.validation.Valid;

import com.algaworks.msr.algalogapi.api.assembler.OcorrenciaAssembler;
import com.algaworks.msr.algalogapi.api.model.dto.OcorrenciaDTO;
import com.algaworks.msr.algalogapi.api.model.input.OcorrenciaInput;
import com.algaworks.msr.algalogapi.domain.model.Entrega;
import com.algaworks.msr.algalogapi.domain.model.Ocorrencia;
import com.algaworks.msr.algalogapi.domain.service.EntregaService;
import com.algaworks.msr.algalogapi.domain.service.usecase.RegistroOcorrenciaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {
    //Attributes:
    RegistroOcorrenciaService registroOcorrenciaService;
    OcorrenciaAssembler ocorrenciaAssembler;
    EntregaService entregaService;

    //Métodos:
    @PostMapping
    public OcorrenciaDTO registrar(@PathVariable Long entregaId, @Valid @RequestBody OcorrenciaInput ocorrenciaInput){
        Ocorrencia ocorrenciaRegistrada = registroOcorrenciaService.registrar(entregaId, ocorrenciaInput.getDescricao());

        return ocorrenciaAssembler.toDTO(ocorrenciaRegistrada);

    }

    @GetMapping
    public List<OcorrenciaDTO> buscar(@PathVariable Long entregaId){
        Entrega entrega = entregaService.buscar(entregaId);

        return ocorrenciaAssembler.toDTO(entrega.getOcorrencias());
    }
}
