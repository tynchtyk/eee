package com.example.pc.kettik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Choose_user_en extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_user_en);
        Button voditel = (Button) findViewById(R.id.voditel);
        voditel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choose_user_en.this, Vod_en.class);
                startActivity(i);
            }
        });

        Button passajir = (Button) findViewById(R.id.passajir);
        passajir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choose_user_en.this, Pas_en.class);
                startActivity(i);
            }
        });
    }
}
