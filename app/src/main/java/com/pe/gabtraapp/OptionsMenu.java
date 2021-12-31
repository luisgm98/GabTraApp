package com.pe.gabtraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OptionsMenu extends AppCompatActivity {

    TextView Title,Description,Close;
    ImageView Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);


        String StrInput = getIntent().getStringExtra("Title");
        Title = findViewById(R.id.Title);
        Title.setText(StrInput);

        String DesInput = getIntent().getStringExtra("Description");
        Description = findViewById(R.id.Description);
        Description.setText(DesInput);

        Image = findViewById(R.id.Image);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            int ImageInput = bundle.getInt("Image");
            Image.setImageResource(ImageInput);
        }

        Close = findViewById(R.id.txtclose);
        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( OptionsMenu.this, Options.class);
                startActivity(intent);
                finish();
            }
        });
    }
}