package com.algaworks.msr.algalogapi.domain.exception;

public class EntidadeNaoEncontradaException extends NegocioException {
    //Atributos:
    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
    
}
