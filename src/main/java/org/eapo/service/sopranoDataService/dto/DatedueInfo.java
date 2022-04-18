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
public class DatedueInfo {

    private int cdtimelimit;
    private Date dtcreatdd;
    private Date dtlimit;
    private String idappli;
    private String iddocument;
    private int idexaminer;
    private String idoper;
    private int issuer;
    private int odcorresp;
    private int oddtdue;
    private int odhisto;
    private String rmdtdue;
    private String sotodo;
    private Date triggers;
    private int tydtdue;
    private int tymanip;

    public void setCdtimelimit(int cdtimelimit) {
        this.cdtimelimit = cdtimelimit;
    }

    public void setDtcreatdd(Date dtcreatdd) {
        this.dtcreatdd = dtcreatdd;
    }

    public void setDtlimit(Date dtlimit) {
        this.dtlimit = dtlimit;
    }

    public void setIdappli(String idappli) {
        this.idappli = idappli;
    }

    public void setIddocument(String iddocument) {
        this.iddocument = iddocument;
    }

    public void setIdexaminer(int idexaminer) {
        this.idexaminer = idexaminer;
    }

    public void setIdoper(String idoper) {
        this.idoper = idoper;
    }

    public void setIssuer(int issuer) {
        this.issuer = issuer;
    }

    public void setOdcorresp(int odcorresp) {
        this.odcorresp = odcorresp;
    }

    public void setOddtdue(int oddtdue) {
        this.oddtdue = oddtdue;
    }

    public void setOdhisto(int odhisto) {
        this.odhisto = odhisto;
    }

    public void setRmdtdue(String rmdtdue) {
        this.rmdtdue = rmdtdue;
    }

    public void setSotodo(String sotodo) {
        this.sotodo = sotodo;
    }

    public void setTriggers(Date triggers) {
        this.triggers = triggers;
    }

    public void setTydtdue(int tydtdue) {
        this.tydtdue = tydtdue;
    }

    public void setTymanip(int tymanip) {
        this.tymanip = tymanip;
    }

    public int getCdtimelimit() {
        return cdtimelimit;
    }

    public Date getDtcreatdd() {
        return dtcreatdd;
    }

    public Date getDtlimit() {
        return dtlimit;
    }

    public String getIdappli() {
        return idappli;
    }

    public String getIddocument() {
        return iddocument;
    }

    public int getIdexaminer() {
        return idexaminer;
    }

    public String getIdoper() {
        return idoper;
    }

    public int getIssuer() {
        return issuer;
    }

    public int getOdcorresp() {
        return odcorresp;
    }

    public int getOddtdue() {
        return oddtdue;
    }

    public int getOdhisto() {
        return odhisto;
    }

    public String getRmdtdue() {
        return rmdtdue;
    }

    public String getSotodo() {
        return sotodo;
    }

    public Date getTriggers() {
        return triggers;
    }

    public int getTydtdue() {
        return tydtdue;
    }

    public int getTymanip() {
        return tymanip;
    }
}
