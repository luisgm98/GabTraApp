package com.pe.gabtraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Button LogInScreen;
    private static int SPLASH_SCREEN = 5000; //Cinco segundos

    //Variables
    Animation topAnim, bottomAnim;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animaciones
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animator);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hooks
        image = findViewById(R.id.imageLogo);

        image.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,LogIn.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}