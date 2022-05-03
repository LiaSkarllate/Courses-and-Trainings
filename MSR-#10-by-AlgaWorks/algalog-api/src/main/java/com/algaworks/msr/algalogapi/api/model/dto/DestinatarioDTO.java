package com.algaworks.msr.algalogapi.api.model.dto;

//Importações:
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DestinatarioDTO {
    //Atributos:
    private String nome;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
}
