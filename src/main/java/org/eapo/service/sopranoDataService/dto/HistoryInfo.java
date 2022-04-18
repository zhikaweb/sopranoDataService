/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eapo.service.sopranoDataService.dto;

import java.sql.Date;

/**
 *
 * @author Usawich
 */
public class HistoryInfo {

    private Date dtaction;
    private Date dtlegal;
    private Date dtoper;
    private int gengen;
    private String idappli;
    private int idgenafter;
    private int idgenbefore;
    private String idoper;
    private int iduseroper;
    private Date lvlpubli;
    private int odhisto;
    private String oldinfo;
    private String rmhisto;
    private int sthisto;
    private int stpay;

    public void setDtaction(Date dtaction) {
        this.dtaction = dtaction;
    }

    public void setDtlegal(Date dtlegal) {
        this.dtlegal = dtlegal;
    }

    public void setDtoper(Date dtoper) {
        this.dtoper = dtoper;
    }

    public void setGengen(int gengen) {
        this.gengen = gengen;
    }

    public void setIdappli(String idappli) {
        this.idappli = idappli;
    }

    public void setIdgenafter(int idgenafter) {
        this.idgenafter = idgenafter;
    }

    public void setIdgenbefore(int idgenbefore) {
        this.idgenbefore = idgenbefore;
    }

    public void setIdoper(String idoper) {
        this.idoper = idoper;
    }

    public void setIduseroper(int iduseroper) {
        this.iduseroper = iduseroper;
    }

    public void setLvlpubli(Date lvlpubli) {
        this.lvlpubli = lvlpubli;
    }

    public void setOdhisto(int odhisto) {
        this.odhisto = odhisto;
    }

    public void setOldinfo(String oldinfo) {
        this.oldinfo = oldinfo;
    }

    public void setRmhisto(String rmhisto) {
        this.rmhisto = rmhisto;
    }

    public void setSthisto(int sthisto) {
        this.sthisto = sthisto;
    }

    public void setStpay(int stpay) {
        this.stpay = stpay;
    }

    public Date getDtaction() {
        return dtaction;
    }

    public Date getDtlegal() {
        return dtlegal;
    }

    public Date getDtoper() {
        return dtoper;
    }

    public int getGengen() {
        return gengen;
    }

    public String getIdappli() {
        return idappli;
    }

    public int getIdgenafter() {
        return idgenafter;
    }

    public int getIdgenbefore() {
        return idgenbefore;
    }

    public String getIdoper() {
        return idoper;
    }

    public int getIduseroper() {
        return iduseroper;
    }

    public Date getLvlpubli() {
        return lvlpubli;
    }

    public int getOdhisto() {
        return odhisto;
    }

    public String getOldinfo() {
        return oldinfo;
    }

    public String getRmhisto() {
        return rmhisto;
    }

    public int getSthisto() {
        return sthisto;
    }

    public int getStpay() {
        return stpay;
    }
}
