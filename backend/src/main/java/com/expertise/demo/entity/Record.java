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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExpertID() {
        return expertID;
    }

    public void setExpertID(Integer expertID) {
        this.expertID = expertID;
    }

    public Integer getProgramID() {
        return programID;
    }

    public void setProgramID(Integer programID) {
        this.programID = programID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getOntime() {
        return ontime;
    }

    public void setOntime(int ontime) {
        this.ontime = ontime;
    }

    public Record(){}

    public Record(Integer expertID,Integer programID,Date time,String comment,int ontime){
        this.comment=comment;
        this.expertID=expertID;
        this.programID=programID;
        this.ontime=ontime;
        this.time=time;
    }

}
