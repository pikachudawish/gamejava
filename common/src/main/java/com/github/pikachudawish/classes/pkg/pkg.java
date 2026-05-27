package com.github.pikachudawish.classes.pkg;

import com.github.pikachudawish.classes.adv.*;
import com.github.pikachudawish.classes.adv.equip.*;
import com.github.pikachudawish.enums.pkgtype;

import java.io.Serial;

public class pkg implements java.io.Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

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

    public pkg() {
        this.type = pkgtype.HEARTBEAT;
    }

    public pkg(pkgtype type, adventurer a) {
        this.type = type;
        this.a = a;
    }

    public pkg(pkgtype type, stats s) {
        this.type = type;
        this.s = s;
    }

    public pkg(pkgtype type, moves m) {
        this.type = type;
        this.m = m;
    }

    public pkg(pkgtype type, equipment e) {
        this.type = type;
        this.e = e;
    }

    public pkg(pkgtype type, armlet ae) {
        this.type = type;
        this.ae = ae;
    }

    public pkg(pkgtype type, helmet he) {
        this.type = type;
        this.he = he;
    }

    public pkg(pkgtype type, chestplate ce) {
        this.type = type;
        this.ce = ce;
    }

    public pkg(pkgtype type, boots be) {
        this.type = type;
        this.be = be;
    }

    public pkg(pkgtype type, resources r) {
        this.type = type;
        this.r = r;
    }

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
