package com.example.krzysztof.tourguide;

import android.util.Log;

import java.io.Serializable;

/**
 * Created by krzysztof on 22.02.2017.
 */

public class Place implements Serializable {

    private String name;
    private String description;
    private int imagePlace;
    private String mail = NO_EMAIL;
    private String header;

    private static final String NO_EMAIL= "";

    /* podstawowy konstruktor z 3 parametrami
    * name - nazwa wyswietlana
    * description - opis miejsca
    * imagePlace - link do zdjecia miejsca
    * */
    public Place(String name, String description, int imagePlace, String header) {
        this.name = name;
        this.description = description;
        this.imagePlace = imagePlace;
        this.header = header;
    }

    // konstruktor z dodatkowym parametrem zawierajacym maila do restauracji
    // mail - mail do restauracji
    //
    public Place(String name, String description, int imagePlace, String header, String mail) {
        this.name = name;
        this.description = description;
        this.imagePlace = imagePlace;
        this.mail = mail;
        this.header = header;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImagePlace() {
        return imagePlace;
    }

    public String getMail() {
        return mail;
    }

    public String getHeader() { return header; }

    public boolean hasEmail() {
        Log.d("mail : ", mail.toString());
        return mail!="";
    }
}
