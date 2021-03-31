package com.expertise.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expert")
@Data
public class Expert {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String gender;
    private Date birth;
    private String type;
    private String area;
    private String company;
    private boolean secret;

    public Expert(){}

    public Expert(String name, String gender, Date birth, String type, String area, String company, boolean secret) {
        this.area=area;
        this.name=name;
        this.birth=birth;
        this.company=company;
        this.gender=gender;
        this.secret=secret;
        this.type=type;
    }
}
