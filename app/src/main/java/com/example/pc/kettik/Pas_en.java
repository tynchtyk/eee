package com.example.pc.kettik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pas_en extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pas_en);
        Button voditel = (Button) findViewById(R.id.search_vod);
        voditel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pas_en.this, Seacrh_vod_en.class);
                startActivity(i);
            }
        });
        Button request = (Button) findViewById(R.id.add_trip);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pas_en.this, Add_request_en.class);
                startActivity(i);
            }
        });
    }
}
