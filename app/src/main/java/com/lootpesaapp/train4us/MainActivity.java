package com.lootpesaapp.train4us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Excercise,Shop,Videos,About;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Excercise=findViewById(R.id.excercise_textview);
        Excercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ExerciseActivity.class));
            }
        });

        Shop=findViewById(R.id.shop_textview);
        Shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ParentalAcessActivity.class));

            }
        });
        Videos=findViewById(R.id.videos_textview);
        Videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,VideosActivity.class));

            }
        });

        About=findViewById(R.id.about_textview);
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AboutActivity.class));

            }
        });
    }
}