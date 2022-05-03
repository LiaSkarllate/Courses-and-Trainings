package com.algaworks.msr.algalogapi.api.assembler;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.msr.algalogapi.api.model.input.EntregaInput;
import com.algaworks.msr.algalogapi.api.model.dto.EntregaDTO;
import com.algaworks.msr.algalogapi.domain.model.Entrega;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaAssembler {
    //Atributos:
    private ModelMapper modelMapper;

    //Métodos:
    public EntregaDTO toDTO(Entrega entrega){
        EntregaDTO entregaDTO = modelMapper.map(entrega, EntregaDTO.class);
        entregaDTO.getCliente().setNome(entrega.getCliente().getName());

        return entregaDTO;
    }

    public List<EntregaDTO> toDTO(List<Entrega> listaEntregas) {
        List<EntregaDTO> listaEntregasDTO = new ArrayList<EntregaDTO>();

        for (Entrega entrega : listaEntregas) {
            listaEntregasDTO.add(this.toDTO(entrega));
        }

        return listaEntregasDTO;
    }

    public Entrega toEntity(EntregaInput entregaInput){
        return modelMapper.map(entregaInput, Entrega.class);
    }
}
