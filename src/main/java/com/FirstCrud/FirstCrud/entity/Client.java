package com.FirstCrud.FirstCrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//Pasta Entity


@Entity 
@Getter
@Setter
public class Client {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; 

    private String Name; 
    private String Password;





}


