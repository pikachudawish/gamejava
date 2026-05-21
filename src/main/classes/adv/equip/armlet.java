package classes.adv.equip;

public class armlet {
    private String name;

    private int lvl;
    private double exp;

    private double def;

    public armlet() {
        this.name = null;
        this.lvl = 0;
        this.exp = 0.0;
        this.def = 0.0;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getLvl() {return lvl;}
    public void setLvl(int lvl) {this.lvl = lvl;}

    public double getExp() {return exp;}
    public void setExp(double exp) {this.exp = exp;}

    public double getDef() {return def;}
    public void setDef(int def) {this.def = def;}


}
