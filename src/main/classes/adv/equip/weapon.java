package classes.adv.equip;

public class weapon {
    private String name;

    private int lvl;
    private double exp;

    private double pd;
    private double md;

    public weapon() {
        this.name = null;
        this.lvl = 0;
        this.exp = 0.0;
        this.pd = 0.0;
        this.md = 0.0;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getLvl() {return lvl;}
    public void setLvl(int lvl) {this.lvl = lvl;}

    public double getExp() {return exp;}
    public void setExp(double exp) {this.exp = exp;}

    public double getPd() {return pd;}
    public void setPd(double pd) {this.pd = pd;}

    public double getMd() {return md;}
    public void setMd(double md) {this.md = md;}
}
