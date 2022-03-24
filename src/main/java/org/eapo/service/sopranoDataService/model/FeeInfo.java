/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 * @author Usawich
 */
public class FeeInfo {

    private String idfee;
//    private int designQty;
//    private boolean untimely;
    private BigDecimal amount;

    public void setIdfee(String idfee) {
        this.idfee = idfee;
    }

//    public void setDesignQty(int designQty) {
//        this.designQty = designQty;
//    }
//
//    public void setUntimely(boolean untimely) {
//        this.untimely = untimely;
//    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    //@GETTERS
    @XmlElement(required = true)
    public String getIdfee() {
        return idfee;
    }

//    public int getDesignQty() {
//        return designQty;
//    }
//
//    public boolean isUntimely() {
//        return untimely;
//    }

    @XmlElement(required = true)
    public BigDecimal getAmount() {
        return amount;
    }
}
