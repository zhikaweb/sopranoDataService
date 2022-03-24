/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.GregorianCalendar;

/**
 *
 * @author Usawich
 */
public class AdditionInfo {

    private String extidappli;
    private GregorianCalendar dtrecept;
    private int iduser;

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setDtrecept(GregorianCalendar dtrecept) {
        this.dtrecept = dtrecept;
    }

    public void setExtidappli(String extidappli) {
        this.extidappli = extidappli;
    }

//@GETTERS 
    @XmlElement(required = true)
    public int getIduser() {
        return iduser;
    }

    @XmlElement(required = true)
    public GregorianCalendar getDtrecept() {
        return dtrecept;
    }

    @XmlElement(required = true)
    public String getExtidappli() {
        return extidappli;
    }
}
