package com.example.krzysztof.tourguide;

import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;

/**
 * Created by krzysztof on 22.02.2017.
 */

public final class DataSource {

    public static ArrayList<Place> getRestaurantsList() {
        ArrayList<Place> restaurants = new ArrayList<Place>();

        for (int i = 0; i< 10; i++) {
            restaurants.add(new Place(
                    "Restauracja Delicja Polska "+i,
                    "Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz w przemyśle poligraficznym. Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum, a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker",
                    R.drawable.w_pic1));
        }
        return restaurants;
    }

}
