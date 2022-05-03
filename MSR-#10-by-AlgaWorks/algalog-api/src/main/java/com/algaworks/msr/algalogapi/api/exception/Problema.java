package com.algaworks.msr.algalogapi.api.exception;

//Imports:
import java.time.LocalDateTime;

public class Problema {
    //Atributos:
    private Integer estado;
    private LocalDateTime dataHora;
    private String descricao;

    //Getters e Setters:
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  
}