package com.example.pc.kettik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Vod_en extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vod_en);
        Button voditel = (Button) findViewById(R.id.search_pas);
        voditel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vod_en.this, Seacrh_pas_en.class);
                startActivity(i);
            }
        });
        Button poezdka = (Button) findViewById(R.id.add_trip);
        poezdka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vod_en.this, Add_trip_en.class);
                startActivity(i);
            }
        });

    }
}
