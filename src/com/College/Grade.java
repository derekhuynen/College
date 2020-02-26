package com.College;

public enum Grade {
    A("A",4),
    B("B",3),
    C("C",2),
    D("D",1),
    F("F",0);

    final private String name;
    final private int credit;

    Grade(String name, int credit){
        this.name = name;
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", this.getName(), this.getCredit());
    }
}
