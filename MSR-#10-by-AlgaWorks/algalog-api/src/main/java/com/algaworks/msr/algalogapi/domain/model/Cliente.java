package com.algaworks.msr.algalogapi.domain.model;

//Imports:
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.algaworks.msr.algalogapi.domain.model.ValidationsGroups.ClienteId;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Setter
@Getter

@Entity
@Table(name = "clientes")
public class Cliente {
    //Attributes:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = ClienteId.class)
    private long id;

    @NotBlank
    @Size(max = 255)
    @Column
    private String name;

    @NotBlank
    @Size(max = 255)
    @Column
    private String cellphone;

    @NotBlank
    @Size(max = 255)
    @Email
    @Column
    private String email;

    //Constructors:
    public Cliente() {

    }

    public Cliente(long id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.cellphone = phone;
        this.email = email;
    }
}