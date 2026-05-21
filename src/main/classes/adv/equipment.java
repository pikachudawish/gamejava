package classes.adv;

import classes.adv.equip.*;

public class equipment {
    private helmet h;
    private chestplate c;
    private armlet a;
    private boots b;
    private weapon w;

    public equipment() {
        this.h = new helmet();
        this.c = new chestplate();
        this.a = new armlet();
        this.b = new boots();
        this.w = new weapon();
    }

    public helmet getH() {return h;}
    public void setH(helmet h) {this.h = h;}

    public armlet getA() {return a;}
    public void setA(armlet a) {this.a = a;}

    public boots getB() {return b;}
    public void setB(boots b) {this.b = b;}

    public weapon getW() {return w;}
    public void setW(weapon w) {this.w = w;}

    public chestplate getC() {return c;}
    public void setC(chestplate c) {this.c = c;}
}
