package com.pe.gabtraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PantallaPrincipal extends AppCompatActivity {

    TextView Options,Contact;
    ImageView Close;
    android.app.Dialog Dialog;
    RelativeLayout lay;
    RelativeLayout PlanAlimenticio;
    Button Calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        //Link
        Calculator = findViewById(R.id.calculator);
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://www.verywellfit.com/recipe-nutrition-analyzer-4157076");
            }
        });

        lay = findViewById(R.id.lay);
        lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( PantallaPrincipal.this, Options.class);
                startActivity(intent);
            }
        });

        PlanAlimenticio = findViewById(R.id.PlanAlimenticio);
        PlanAlimenticio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PantallaPrincipal.this,PlanAlimenticio.class);
                startActivity(intent);
            }
        });

        //////////////////////////////////////////////////////
        Dialog = new Dialog(this);
        Contact = findViewById(R.id.Contact);
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowContactPopUp();
            }
        });
    }

    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void ShowContactPopUp(){
        Dialog.setContentView(R.layout.contact_popup);
        Close = (ImageView) Dialog.findViewById(R.id.Close);
        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }

}