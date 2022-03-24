/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Usawich
 */
public class PriorityInfo {

    public enum Typrio {
        PREV_APP, ADD_DOCS, PREV_EA_APP, SHOW
    }
    private Typrio typrio;
    private String idcountry;
    private String noprio;
    private XMLGregorianCalendar dtprio;
    private final int STPRIO = 1;

    public void setTyprio(Typrio typrio) {
        this.typrio = typrio;
    }

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }

    public void setNoprio(String noprio) {
        this.noprio = noprio;
    }

    public void setDtprio(XMLGregorianCalendar dtprio) {
        this.dtprio = dtprio;
    }

    //@GETTERS 
    public Typrio getTyprio() {
        return typrio;
    }

    public String getIdcountry() {
        return idcountry;
    }

    public String getNoprio() {
        return noprio;
    }

//    @XmlElement(required = true) //потом исправить
    public XMLGregorianCalendar getDtprio() {
        return dtprio;
    }

    public int getSTPRIO() {
        return STPRIO;
    }

}
