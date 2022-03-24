/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Usawich
 */
public class InventorInfo {

    private String nminventor;
    private String fninventor;
    private String midninventor;
    private String adinventor;
    private String emailinventor;
    private String idcountry;
    private String idinventor;
    private Boolean confident;
    private String designsAuthor;

    public void setIdinventor(String idinventor) {
        this.idinventor = idinventor;
    }
    


    public void setConfident(Boolean confident) {
        this.confident = confident;
    }

    public void setNminventor(String nminventor) {
        this.nminventor = nminventor;
    }

    public void setFninventor(String fninventor) {
        this.fninventor = fninventor;
    }

    public void setMidninventor(String midninventor) {
        this.midninventor = midninventor;
    }

    public void setAdinventor(String adinventor) {
        this.adinventor = adinventor;
    }

    public void setEmailinventor(String emailinventor) {
        this.emailinventor = emailinventor;
    }
 

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }
    public void setDesignsAuthor(String designsAuthor) { this.designsAuthor = designsAuthor; }

 
//@GETERS
    
    public String getIdinventor() {
        return idinventor;
    }

    public Boolean isConfident() {
        return confident != null ? confident : false;
    }
    
    @XmlElement(required = true)
    public String getNminventor() {
        return nminventor;
    }
 
    public String getFninventor() {
        return fninventor;
    }

    public String getMidninventor() {
        return midninventor;
    }

    public String getAdinventor() {
        return adinventor;
    }

    public String getEmailinventor() {
        return emailinventor;
    }

    public String getDesignsAuthor() {
        return designsAuthor;
    }
 
    @XmlElement(required = true)
    public String getIdcountry() {
        return idcountry;
    }

    @Override
    public String toString() {
        return "InventorInfo{" + "nminventor=" + nminventor + ", fninventor=" + fninventor + ", midninventor=" + midninventor + ", adinventor=" + adinventor + ", emailinventor=" + emailinventor + ", idcountry=" + idcountry + '}';
    }
 
    
}
