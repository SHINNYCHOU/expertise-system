package com.expertise.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "program")
public class Program {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;

    private String area;
    private String keyword;
    private Date time;
    private int state;
    private int number;


}
