/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 * @author ASomov
 */
public class Application {

    
    private ApplicationInfo applicationInfo;
    private List<InventorInfo> inventorInfo;
    private List<OwnerInfo> ownInfoList;
    private List<RepresentInfo> representInfo;
    private SpecialAddress specialAddress;
    private List<DocappliInfo> docappliInfo;
    private List<DesignInfo> designInfo;
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDesignInfo(List<DesignInfo> designInfo) {
        this.designInfo = designInfo;
    }

    public void setDocappliInfo(List<DocappliInfo> docappliInfo) {
        this.docappliInfo = docappliInfo;
    }

    public void setSpecialAddress(SpecialAddress specialAddress) {
        this.specialAddress = specialAddress;
    }

    public void setRepresentInfo(List<RepresentInfo> representInfo) {
        this.representInfo = representInfo;
    }

    public void setOwnInfoList(List<OwnerInfo> ownInfoList) {
        this.ownInfoList = ownInfoList;
    }

    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public void setInventorInfo(List<InventorInfo> inventorInfo) {
        this.inventorInfo = inventorInfo;
    }

//@GETTERS

    public Payment getPayment() {
        return payment;
    }

    public List<DesignInfo> getDesignInfo() {
        return designInfo;
    }

    public List<DocappliInfo> getDocappliInfo() {
        return docappliInfo;
    }

    public SpecialAddress getSpecialAddress() {
        return specialAddress;
    }

    public List<RepresentInfo> getRepresentInfo() {
        return representInfo;
    }

    @XmlElement(required = true)
    public List<OwnerInfo> getOwnInfoList() {
        return ownInfoList;
    }

    @XmlElement(required = true)
    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    @XmlElement(required = true)
    public List<InventorInfo> getInventorInfo() {
        return inventorInfo;
    }
}
