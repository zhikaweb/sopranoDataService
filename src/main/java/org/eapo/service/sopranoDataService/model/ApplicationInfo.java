/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Usawich
 */
public class ApplicationInfo {

    private int iduser;
    private String extidappli;
    private XMLGregorianCalendar dtrecept;
    private String rfappli;
    private int nbdesign;
    private String title;
    public enum Tyappli{DIRECT, NATIONAL, MADRID} //напрямую; нац вед.; мадрид
    private Tyappli tyappli;
    private boolean isexam;

    public void setIsexam(boolean isexam) {
        this.isexam = isexam;
    }

    public void setTyappli(Tyappli tyappli) {
        this.tyappli = tyappli;
    }
    
    
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNbdesign(int nbdesign) {
        this.nbdesign = nbdesign;
    }

    public void setRfappli(String rfappli) {
        this.rfappli = rfappli;
    }

    public void setDtrecept(XMLGregorianCalendar dtrecept) {
        this.dtrecept = dtrecept;
    }

    public void setExtidappli(String extidappli) {
        this.extidappli = extidappli;
    }
    @XmlElement(required = true)
    public Tyappli getTyappli() {
        return tyappli;
    }

    public boolean isIsexam() {
        return isexam;
    }

//@GETTERS
    
    public int getIduser() {
        return iduser;
    }

    @XmlElement(required = true)
    public String getTitle() {
        return title;
    }

    @XmlElement(required = true)
    public int getNbdesign() {
        return nbdesign;
    }

    @XmlElement(required = true)
    public XMLGregorianCalendar getDtrecept() {
        return dtrecept;
    }

    @XmlElement(required = true)
    public String getRfappli() {
        return rfappli;
    }

    @XmlElement(required = true)
    public String getExtidappli() {
        return extidappli;
    }
}
