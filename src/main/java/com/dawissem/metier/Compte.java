package com.dawissem.metier;

import com.sun.tools.xjc.model.CDefaultValue;

import java.util.Date;

public class Compte {
    private long code ;
    private double solde;
    private Date dateofCreation;

    public Compte(Long code, double v, Date date) {
    }

    public Long getCode(){
        return code;
    }

    public void setCode(Long code){
        this.code=code;
    }
}
