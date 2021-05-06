package com.lootpesaapp.train4us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.URI;

public class ShopActivity extends AppCompatActivity {

    Button tweight;
    TextView weight,yoga_met,hola_hoops,football,bouncy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);




        weight=findViewById(R.id.weight);
        weight.setMovementMethod(LinkMovementMethod.getInstance());
        yoga_met=findViewById(R.id.yoga_met);
        yoga_met.setMovementMethod(LinkMovementMethod.getInstance());
        hola_hoops=findViewById(R.id.hula_hoops);
        hola_hoops.setMovementMethod(LinkMovementMethod.getInstance());
        football=findViewById(R.id.football);
        football.setMovementMethod(LinkMovementMethod.getInstance());
        bouncy=findViewById(R.id.bouncy);
        bouncy.setMovementMethod(LinkMovementMethod.getInstance());
    }
}