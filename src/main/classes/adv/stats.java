package classes.adv;

public class stats {
    private int lvl;
    private double exp;

    private double hp;
    private double pd;
    private double md;
    private double spd;
    private double def;

    public stats() {
        this.lvl = 1;
        this.exp = 0.0;
        this.hp = 0.0;
        this.pd = 0.0;
        this.md = 0.0;
        this.spd = 0.0;
        this.def = 0.0;
    }

    public stats(int lvl, double exp,double hp,double pd, double md, double spd, double def) {
        this.lvl = lvl;
        this.exp = exp;
        this.hp = hp;
        this.pd = pd;
        this.md = md;
        this.spd = spd;
        this.def = def;
    }

    public int getLvl() {return lvl;}
    public void setLvl(int lvl) {this.lvl = lvl;}

    public double getExp() {return exp;}
    public void setExp(double exp) {this.exp = exp;}

    public double getHp() {return hp;}
    public void setHp(double hp) {this.hp = hp;}

    public double getPd() {return pd;}
    public void setPd(double pd) {this.pd = pd;}

    public double getMd() {return md;}
    public void setMd(double md) {this.md = md;}

    public double getSpd() {return spd;}
    public void setSpd(double spd) {this.spd = spd;}

    public double getDef() {return def;}
    public void setDef(double def) {this.def = def;}
}
