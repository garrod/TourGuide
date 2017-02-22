package com.example.krzysztof.tourguide;

/**
 * Created by krzysztof on 22.02.2017.
 */

public class Place {

    private String name;
    private String description;
    private int imagePlace;
    private String mail;

    /* podstawowy konstruktor z 3 parametrami
    * name - nazwa wyswietlana
    * description - opis miejsca
    * imagePlace - link do zdjecia miejsca
    * */
    public Place(String name, String description, int imagePlace) {
        this.name = name;
        this.description = description;
        this.imagePlace = imagePlace;
    }

    // konstruktor z dodatkowym parametrem zawierajacym maila do restauracji
    // mail - mail do restauracji
    //
    public Place(String name, String description, int imagePlace, String mail) {
        this.name = name;
        this.description = description;
        this.imagePlace = imagePlace;
        this.mail = mail;
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
}
