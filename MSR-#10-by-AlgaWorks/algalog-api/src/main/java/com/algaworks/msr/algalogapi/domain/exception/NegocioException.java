package com.algaworks.msr.algalogapi.domain.exception;

public class NegocioException extends RuntimeException {
    //Atributos:
    private static final long serialVersionUID = 1L;

    //Construtores:
    public NegocioException(String mensagem) {
        super(mensagem); 
    } 
}
