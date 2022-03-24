/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.model;

/**
 *
 * @author Usawich
 */
public class DocappliInfo {

    private String iddocument;
    private int topages;

    public void setIddocument(String iddocument) {
        this.iddocument = iddocument;
    }

    public void setTopages(int topages) {
        this.topages = topages;
    }

    public String getIddocument() {
        return iddocument;
    }

    public int getTopages() {
        return topages;
    }
}
