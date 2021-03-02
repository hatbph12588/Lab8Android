package com.example.lab8;

public class Music {
    private String nameBaiHat;
    private String nameTacGia;
    private int parth ;

    public Music(String nameBaiHat, String nameTacGia, int parth) {
        this.nameBaiHat = nameBaiHat;
        this.nameTacGia = nameTacGia;
        this.parth = parth;
    }

    public int getParth() {
        return parth;
    }

    public void setParth(int parth) {
        this.parth = parth;
    }

    public String getNameBaiHat() {
        return nameBaiHat;
    }

    public void setNameBaiHat(String nameBaiHat) {
        this.nameBaiHat = nameBaiHat;
    }

    public String getNameTacGia() {
        return nameTacGia;
    }

    public void setNameTacGia(String nameTacGia) {
        this.nameTacGia = nameTacGia;
    }

}
