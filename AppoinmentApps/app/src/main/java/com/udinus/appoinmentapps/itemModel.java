package com.udinus.appoinmentapps;

public class itemModel {
    private String date;
    private String place;
    private String with;

    public itemModel(String date,String place,String with) {
        this.date = date;
        this.place = place;
        this.with = with;

    }

    public String getDate() {
        return date;
    }
    public String getPlace(){ return place;}
    public String getWith() {
        return with;
    }

}
