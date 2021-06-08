package com.udinus.appoinmentapps;

public class itemModel {
    private String name;
    private String harga;

    public itemModel(String name,String harga) {
        this.name = name;
        this.harga = harga;

    }

    public String getName() {
        return name;
    }
    public String getHarga(){ return harga;}

}
