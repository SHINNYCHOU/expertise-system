package com.expertise.demo.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expert")
@Data
public class Expert {
    @Id
    @ExcelProperty("专家身份证号")
    private Integer id;
    @ExcelProperty("专家姓名")
    private String name;
    @ExcelProperty("性别")
    private String gender;
    @ExcelProperty("出生年月")
    private Date birth;
    @ExcelProperty("专家类型")
    private String type;
    @ExcelProperty("专家地区")
    private String area;
    @ExcelProperty("专家所属单位")
    private String company;
    @ExcelProperty("是否机密")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isSecret() {
        return secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }
}
