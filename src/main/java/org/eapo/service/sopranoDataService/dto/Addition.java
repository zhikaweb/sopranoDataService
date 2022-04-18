/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.dto;

import java.util.List;

/**
 *
 * @author ASomov
 */
public class Addition {

    private AdditionInfo additionInfo;
    private List<DocappliInfo> docappliInfo;
    private Payment payment;
    private List<DesignInfo> designInfo;

    public void setDesignInfo(List<DesignInfo> designInfo) {
        this.designInfo = designInfo;
    }
    

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    public void setDocappliInfo(List<DocappliInfo> docappliInfo) {
        this.docappliInfo = docappliInfo;
    }

    public void setAdditionInfo(AdditionInfo additionInfo) {
        this.additionInfo = additionInfo;
    } 

    public List<DesignInfo> getDesignInfo() {
        return designInfo;
    }

//GETTERS

    public Payment getPayment() {
        return payment;
    }

    public AdditionInfo getAdditionInfo() {
        return additionInfo;
    }

    public List<DocappliInfo> getDocappliInfo() {
        return docappliInfo;
    } 

}
