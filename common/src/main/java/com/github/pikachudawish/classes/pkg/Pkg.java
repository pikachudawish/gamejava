package com.github.pikachudawish.classes.pkg;

import com.github.pikachudawish.classes.adv.*;
import com.github.pikachudawish.classes.adv.equip.*;
import com.github.pikachudawish.enums.pkgtype;

import java.io.Serial;

public class Pkg implements java.io.Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    private int transactionID;
    private pkgtype type;

    private adventurer a;
    private stats s;
    private moves m;
    private equipment e;
    private armlet ae;
    private helmet he;
    private chestplate ce;
    private boots be;
    private resources r;

    public Pkg() {
        this.type = pkgtype.HEARTBEAT;
    }

    public Pkg(int transactionID, pkgtype type, adventurer a) {
        this.transactionID = transactionID;
        this.type = type;
        this.a = a;
    }

    public Pkg(int transactionID, pkgtype type, stats s) {
        this.transactionID = transactionID;
        this.type = type;
        this.s = s;
    }

    public Pkg(int transactionID, pkgtype type, moves m) {
        this.transactionID = transactionID;
        this.type = type;
        this.m = m;
    }

    public Pkg(int transactionID, pkgtype type, equipment e) {
        this.transactionID = transactionID;
        this.type = type;
        this.e = e;
    }

    public Pkg(int transactionID, pkgtype type, armlet ae) {
        this.transactionID = transactionID;
        this.type = type;
        this.ae = ae;
    }

    public Pkg(int transactionID, pkgtype type, helmet he) {
        this.transactionID = transactionID;
        this.type = type;
        this.he = he;
    }

    public Pkg(int transactionID, pkgtype type, chestplate ce) {
        this.transactionID = transactionID;
        this.type = type;
        this.ce = ce;
    }

    public Pkg(int transactionID, pkgtype type, boots be) {
        this.transactionID = transactionID;
        this.type = type;
        this.be = be;
    }

    public Pkg(int transactionID, pkgtype type, resources r) {
        this.transactionID = transactionID;
        this.type = type;
        this.r = r;
    }

    public int getTransactionID() {return transactionID;}
    public void setTransactionID(int transactionID) {this.transactionID = transactionID;}

    public pkgtype getType() {return type;}
    public void setType(pkgtype type) {this.type = type;}

    public adventurer getA() {return a;}
    public void setA(adventurer a) {this.a = a;}

    public stats getS() {return s;}
    public void setS(stats s) {this.s = s;}

    public moves getM() {return m;}
    public void setM(moves m) {this.m = m;}

    public equipment getE() {return e;}
    public void setE(equipment e) {this.e = e;}

    public armlet getAe() {return ae;}
    public void setAe(armlet ae) {this.ae = ae;}

    public helmet getHe() {return he;}
    public void setHe(helmet he) {this.he = he;}

    public chestplate getCe() {return ce;}
    public void setCe(chestplate ce) {this.ce = ce;}

    public boots getBe() {return be;}
    public void setBe(boots be) {this.be = be;}

    public resources getR() {return r;}
    public void setR(resources r) {this.r = r;}


}
