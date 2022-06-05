package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee { //employee

    @Id
    private int id;
    private String name;


}
