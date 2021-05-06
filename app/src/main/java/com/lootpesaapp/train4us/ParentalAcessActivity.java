package com.lootpesaapp.train4us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ParentalAcessActivity extends AppCompatActivity {

    String pattern="train4us122";
    EditText enterpatetrn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parental_acess);
        enterpatetrn=findViewById(R.id.loanfacilitaion_enter);
    }

    public void Proceed(View view) {

        boolean flag=true;
        String code=enterpatetrn.getText().toString();

        if (!code.equals(pattern)){
            flag=false;
            Toast.makeText(this, "Wrong Pin", Toast.LENGTH_SHORT).show();

        }
        else
        {
            flag=true;
        }


        if (flag==true)
        {
            Intent intent=new Intent(ParentalAcessActivity.this,ShopActivity.class);
            startActivity(intent);
            finish();
        }


    }
}