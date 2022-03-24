/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

import java.util.List;

/**
 *
 * @author ASomov
 */
public class DesignInfo {

    private String nodesign;
    private Integer oddesign;

    private String complect;
    private int nbDraw;
    private String title;
    private String product;


    private String locclass;
    private String locclassmain;

    private PriorityInfo priorityInfo;
    private List<DocappliInfo> docappliInfo;

    public void setDocappliInfo(List<DocappliInfo> docappliInfo) {
        this.docappliInfo = docappliInfo;
    }

    public void setPriorityInfo(PriorityInfo priorityInfo) {
        this.priorityInfo = priorityInfo;
    }

    public void setNodesign(String nodesign) {
        this.nodesign = nodesign;
    }

    public void setLocclass(String locclass) {
        this.locclass = locclass;
    }

    public void setLocclassmain(String locclassmain) {
        this.locclassmain = locclassmain;
    }

    public void setComplect(String complect) {
        this.complect = complect;
    }

    public void setNbDraw(int nbDraw) {
        this.nbDraw = nbDraw;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//@GETTERS

    public List<DocappliInfo> getDocappliInfo() {
        return docappliInfo;
    }
    public PriorityInfo getPriorityInfo() {
        return priorityInfo;
    }

//    @XmlElement(required = true)
    public String getNodesign() {
        return nodesign;
    }

//    @XmlElement(required = true)
    public String getLocclass() {
        return locclass;
    }

//    @XmlElement(required = true)
    public String getLocclassmain() {
        return locclassmain;
    }

//    @XmlElement(required = true)
    public String isComplect() {
        return complect;
    }

//    @XmlElement(required = true)
    public int getNbDraw() {
        return nbDraw ;
    }

//    @XmlElement(required = true)
    public String getTitle() {
        return title;
    }

    public Integer getOddesign() {
        return oddesign;
    }

    public void setOddesign(Integer oddesign) {
        this.oddesign = oddesign;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
