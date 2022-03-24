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
public class OwnerInfo {

    private String fnowner;
    private String midnowner;
    private String nmowner;
    private String telowner;
    private String faxowner;
    private String emailowner;
    private String idcountry;
    private String adowner;
    private Integer idowner;
    public enum Tyowner{PHIS, UR, AS};
    private Tyowner tyowner;

    public void setIdowner(Integer idowner) {
        this.idowner = idowner;
    }

    public void setTyowner(Tyowner tyowner) {
        this.tyowner = tyowner;
    }

    public void setFnowner(String fnowner) {
        this.fnowner = fnowner;
    }

    public void setMidnowner(String midnowner) {
        this.midnowner = midnowner;
    }

    public void setNmowner(String nmowner) {
        this.nmowner = nmowner;
    }

    public void setTelowner(String telowner) {
        this.telowner = telowner;
    }

    public void setFaxowner(String faxowner) {
        this.faxowner = faxowner;
    }

    public void setEmailowner(String emailowner) {
        this.emailowner = emailowner;
    }

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }

    public void setAdowner(String adowner) {
        this.adowner = adowner;
    }

    //@GETTES
    
    public Integer getIdowner() {
        return idowner == null ? 0 : idowner;
    }

    @XmlElement(required = true)
    public Tyowner getTyowner() {
        return tyowner;
    }

    public String getFnowner() {
        return fnowner;
    }

    public String getMidnowner() {
        return midnowner;
    }

    @XmlElement(required = true)
    public String getNmowner() {
        return nmowner;
    }

    public String getTelowner() {
        return telowner;
    }

    public String getFaxowner() {
        return faxowner;
    }

    public String getEmailowner() {
        return emailowner;
    }

    @XmlElement(required = true)
    public String getIdcountry() {
        return idcountry;
    }

    public String getAdowner() {
        return adowner;
    }

    @Override
    public String toString() {
        return "OwnerInfo{" + "fnowner=" + fnowner + ", midnowner=" + midnowner + ", nmowner=" + nmowner + ", telowner=" + telowner + ", faxowner=" + faxowner + ", emailowner=" + emailowner + ", idcountry=" + idcountry + ", adowner=" + adowner + '}';
    }
    
    

}
