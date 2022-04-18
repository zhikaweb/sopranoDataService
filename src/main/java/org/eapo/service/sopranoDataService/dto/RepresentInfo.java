/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.dto;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Usawich
 */
public class RepresentInfo {

    private Integer tyrepresent;
    private Integer idperson;
    private String fnperson;
    private String midnperson;
    private String nmperson;
    private String telperson;
    private String faxperson;
    private String emailperson;
    private String idcountry;
    private String adperson;

    public void setTyrepresent(Integer tyrepresent) {
        this.tyrepresent = tyrepresent;
    }

    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }

    public void setFnperson(String fnperson) {
        this.fnperson = fnperson;
    }

    public void setMidnperson(String midnperson) {
        this.midnperson = midnperson;
    }

    public void setNmperson(String nmperson) {
        this.nmperson = nmperson;
    }

    public void setTelperson(String telperson) {
        this.telperson = telperson;
    }

    public void setFaxperson(String faxperson) {
        this.faxperson = faxperson;
    }

    public void setEmailperson(String emailperson) {
        this.emailperson = emailperson;
    }

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }

    public void setAdperson(String adperson) {
        this.adperson = adperson;
    }

//    @GETTERS
    
    @XmlElement(required = true)
    public Integer getTyrepresent() {
        return tyrepresent;
    }

    public Integer getIdperson() {
        return idperson;
    }

    public String getFnperson() {
        return fnperson;
    }

    public String getMidnperson() {
        return midnperson;
    }

    @XmlElement(required = true)
    public String getNmperson() {
        return nmperson;
    }

    public String getTelperson() {
        return telperson;
    }

    public String getFaxperson() {
        return faxperson;
    }

    public String getEmailperson() {
        return emailperson;
    }
    
    @XmlElement(required = true)
    public String getIdcountry() {
        return idcountry;
    }

    public String getAdperson() {
        return adperson;
    }
}
