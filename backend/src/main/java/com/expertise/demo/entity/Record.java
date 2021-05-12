package com.expertise.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "meetingrecord")
public class Record {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Integer expertID;
    private Integer programID;
    private Date time;
    private String comment;
    private int ontime;

    public Record(){}

    public Record(Integer expertID,Integer programID,Date time,String comment,int ontime){
        this.comment=comment;
        this.expertID=expertID;
        this.programID=programID;
        this.ontime=ontime;
        this.time=time;
    }

}
