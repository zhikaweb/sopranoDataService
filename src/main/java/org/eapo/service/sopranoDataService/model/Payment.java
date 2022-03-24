/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Usawich
 */
public class Payment {
    public enum Typayer{ADVANCE, PAYORDER};
    private Typayer typayer;
    private List<FeeInfo> ftocollectInfo;
    private BigDecimal discount;

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setTypayer(Typayer typayer) {
        this.typayer = typayer;
    }

    public void setFtocollectInfo(List<FeeInfo> ftocollectInfo) {
        this.ftocollectInfo = ftocollectInfo;
    }

    //@GETTERS
    
    public BigDecimal getDiscount() {
        return discount;
    }

    public Typayer getTypayer() {
        return typayer;
    }

    public List<FeeInfo> getFtocollectInfo() {
        return ftocollectInfo;
    }

}
