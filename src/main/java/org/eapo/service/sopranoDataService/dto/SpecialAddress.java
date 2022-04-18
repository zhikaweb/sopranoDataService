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
public class SpecialAddress {

    private String faxperson;
    private String telperson;
    private String emailperson;
    private String adperson;
    private Integer idperson;
    private String nmperson;
    private String fnperson;
    private String midnperson;
    private String idcountry;

    public void setFnperson(String fnperson) {
        this.fnperson = fnperson;
    }

    public void setMidnperson(String midnperson) {
        this.midnperson = midnperson;
    }

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }

    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }

    public void setFaxperson(String faxperson) {
        this.faxperson = faxperson;
    }

    public void setTelperson(String telperson) {
        this.telperson = telperson;
    }

    public void setEmailperson(String emailperson) {
        this.emailperson = emailperson;
    }

    public void setNmperson(String nmperson) {
        this.nmperson = nmperson;
    }

    public void setAdperson(String adperson) {
        this.adperson = adperson;
    }

    //@GETTERS
    public String getIdcountry() {
        return idcountry;
    }
    
    public Integer getIdperson() {
        return idperson;
    }

    @XmlElement(required = true)
    public String getNmperson() {
        return nmperson;
    }

    @XmlElement(required = true)
    public String getAdperson() {
        return adperson;
    }

    public String getFnperson() {
        return fnperson;
    }

    public String getMidnperson() {
        return midnperson;
    }

    public String getFaxperson() {
        return faxperson;
    }

    public String getTelperson() {
        return telperson;
    }

    public String getEmailperson() {
        return emailperson;
    }

}
