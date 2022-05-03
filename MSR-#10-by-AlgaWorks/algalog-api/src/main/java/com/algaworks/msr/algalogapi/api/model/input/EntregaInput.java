package com.algaworks.msr.algalogapi.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EntregaInput {
    //Atributos:
    @NotNull
    private Long clienteId;

    @NotNull 
    @Valid
    private DestinatarioInput destinatario;

    @NotNull
    private BigDecimal taxa;
}
