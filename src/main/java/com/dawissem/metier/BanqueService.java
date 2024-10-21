package com.dawissem.metier;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import javax.print.attribute.standard.Compression;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService (serviceName = "BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroDt")
    public double conversion(@WebParam(name="montant") double mt)
    {
        return mt*3.37;
    }
    @WebMethod
    public Compte getCmpte(@WebParam(name = "code") Long code)
    {
        return new Compte(code,Math.random()*9000, new Date());

    }

    @WebMethod
    public List<Compte> listOfComtes(){
        List<Compte> comptes = new ArrayList<Compte>(); /* list feha les comptes */
        comptes.add(new Compte(1L, Math.random()*9000, new Date()));
        comptes.add(new Compte(2L, Math.random()*9000, new Date()));
        comptes.add(new Compte(3L, Math.random()*9000, new Date()));
        return comptes;
    }
}
