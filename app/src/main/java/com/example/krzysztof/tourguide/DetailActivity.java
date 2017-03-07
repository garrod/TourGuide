package com.example.krzysztof.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    public String val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Place place = (Place) getIntent().getSerializableExtra("place");
        setContentView(R.layout.activity_detail);

        val = ((String) ("mailto : " + place.getMail()));

        ImageView placePhoto = (ImageView) findViewById(R.id.detail_photo_src);
        placePhoto.setImageResource(place.getImagePlace());

        TextView placeName = (TextView) findViewById(R.id.detail_place_name);
        placeName.setText(place.getName());

        TextView placeDescription = (TextView) findViewById(R.id.detail_description);
        placeDescription.setText(place.getDescription());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        if(place.hasEmail()){
            fab.setVisibility(View.VISIBLE);
            Log.d("mail","jest mail");
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, val, Snackbar.LENGTH_LONG)
                            .setAction("Action", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    sendEmail(place.getMail());
                                }
                            }).show();
                }
            });
        }
        else {
            Log.d("mail","nie ma maila");
            fab.setVisibility(View.GONE);
        }

    }
    private void sendEmail(String mail) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + mail));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Rezerwacja w restauracji");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Chcialbym zarezerwować miejsce w restauracji w dniu ... ");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "No email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

//        String val = ((String) ("kliknieto : " + position));
//        Toast.makeText(this, val, Toast.LENGTH_SHORT).show();

}
