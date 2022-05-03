package com.algaworks.msr.algalogapi.api.assembler;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.msr.algalogapi.api.model.dto.OcorrenciaDTO;
import com.algaworks.msr.algalogapi.domain.model.Ocorrencia;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class OcorrenciaAssembler {
    private ModelMapper modelMapper;

    public OcorrenciaDTO toDTO(Ocorrencia ocorrencia){
        return modelMapper.map(ocorrencia, OcorrenciaDTO.class);
    }

    public List<OcorrenciaDTO> toDTO(List<Ocorrencia> listOcorrencias){
        List<OcorrenciaDTO> listOcorrenciasDTO = new ArrayList<OcorrenciaDTO>();

        for (Ocorrencia ocorrencia : listOcorrencias) {
            listOcorrenciasDTO.add(this.toDTO(ocorrencia));
        }

        return listOcorrenciasDTO;
    }


}
