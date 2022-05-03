package com.algaworks.msr.algalogapi.api.model.dto;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaDTO {
    private Long id;
    private String descricao;
    private OffsetDateTime dataOcorrencia;
}
