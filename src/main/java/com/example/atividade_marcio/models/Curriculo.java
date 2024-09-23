package com.example.atividade_marcio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curriculo {
    @Id
    int id;
    String nome;
    String address;
    String CEP;
    //Lembrar de criar futuramente uma classe especifica para o tipo Contact, onde serao inseridos dados extras na class. Como: email, numero de telefone e Linkedin
    String contact;
    String nationality;
    String district;
    int number;
    String complement;

}
