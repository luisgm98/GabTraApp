package com.pe.gabtraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OptionsMenu extends AppCompatActivity {

    TextView Title,Description;
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
    }
}