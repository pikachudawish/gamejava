package com.github.pikachudawish.adv;

public class adventurer {
    private int id;
    private String name;

    private stats s;
    private moves m;
    private equipment e;

    public adventurer(int id, String name) {
        this.id = id;
        this.name = name;
        this.s = new stats();
        this.m = new moves();
        this.e = new equipment();
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public stats getS() {return s;}
    public void setS(stats s) {this.s = s;}

    public moves getM() {return m;}
    public void setM(moves m) {this.m = m;}

    public equipment getE() {return e;}
    public void setE(equipment e) {this.e = e;}
}
