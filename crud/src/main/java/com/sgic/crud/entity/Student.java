package com.sgic.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "f_name")
    private String first_name;

    @Column(name = "l_name")
    private String last_name;

    private String email;
}