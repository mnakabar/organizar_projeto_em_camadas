package com.developper.entities;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    public User(){

    }
    public User(Long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
