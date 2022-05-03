package com.algaworks.msr.algalogapi.api.model.dto;

//Importações:
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.msr.algalogapi.domain.model.Situacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class EntregaDTO {
    //Atributos:
    private Long id;
    private ClienteResumoDTO cliente;
    private DestinatarioDTO destinatario;
    private BigDecimal taxa;
    private Situacao situacao;
    private OffsetDateTime dataPedido;
    private OffsetDateTime dataFinalizacao;
}
