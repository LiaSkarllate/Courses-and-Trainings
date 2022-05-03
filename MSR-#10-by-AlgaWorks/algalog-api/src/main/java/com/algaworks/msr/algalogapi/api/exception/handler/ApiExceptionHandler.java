package com.algaworks.msr.algalogapi.api.exception.handler;

//Imports:
import java.time.LocalDateTime;

import com.algaworks.msr.algalogapi.api.exception.Problema;
import com.algaworks.msr.algalogapi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.msr.algalogapi.domain.exception.NegocioException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    //Métodos:
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
        //Variáveis:
        Problema problema = new Problema();

        //Lógica:
        problema.setEstado(status.value());
        problema.setDataHora(LocalDateTime.now());
        problema.setDescricao("Um ou mais campos contêm valores inválidos. Faça o preenchimento corretamente e tente novamente");
        
        return handleExceptionInternal(ex, problema, headers, status, request);
    }

    @ExceptionHandler(NegocioException.class)
    public ResponseEntity<Object> handleNegocio(NegocioException ex, WebRequest request) {
        //Variáveis:
        Problema problema = new Problema();
        HttpStatus estado = HttpStatus.BAD_REQUEST;

        //Lógica:
        problema.setEstado(estado.value());
        problema.setDataHora(LocalDateTime.now());
        problema.setDescricao(ex.getMessage());

        return handleExceptionInternal(ex, problema, new HttpHeaders(), estado, request);
    }

    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<Object> handleEntidadeNaoEncontradaException(EntidadeNaoEncontradaException ex, WebRequest request) {
        //Variáveis:
        Problema problema = new Problema();
        HttpStatus estado = HttpStatus.NOT_FOUND;

        //Lógica:
        problema.setEstado(estado.value());
        problema.setDataHora(LocalDateTime.now());
        problema.setDescricao(ex.getMessage());

        return handleExceptionInternal(ex, problema, new HttpHeaders(), estado, request);
    }
}