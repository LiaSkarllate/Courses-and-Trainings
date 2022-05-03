package com.algaworks.msr.algalogapi.api.model.input;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OcorrenciaInput {
    //Atributos:
    @NotBlank
    private String descricao;
}
