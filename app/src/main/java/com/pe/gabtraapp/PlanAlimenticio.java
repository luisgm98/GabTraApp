package com.pe.gabtraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Objects;

public class PlanAlimenticio extends AppCompatActivity {

    private Spinner spinnerDays, spinnerMeals;
    android.app.Dialog Dialog;
    ImageView CloseLac;
    Button Aceptar;
    TextView Lac, Fru, Veg, Har, Pro, Gra, Liq;
    TextView LacRes, FruRes, VegRes, HarRes, ProRes, GraRes, LiqRes;
    TextView Lacteos,Frutas,Vegetales,Harinas,Proteinas,Grasas,Liquidos;
    ImageButton SumLac, ResLac, SumFru, ResFru, SumVeg, ResVeg, SumHar, ResHar, SumPro, ResPro, SumGra, ResGra, SumLiq, ResLiq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_alimenticio);

        //  Spinner
        spinnerDays = (Spinner) findViewById(R.id.spinnerDays);
        String [] Dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        ArrayAdapter<String> SpinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Dias);
        spinnerDays.setAdapter(SpinnerAdapter);

        //Spinner2
        spinnerMeals = (Spinner) findViewById(R.id.spinnerMeals);
        String [] Meals = {"Pre Ejercicio","Desayuno","Merienda AM","Almuerzo","Merienda PM","Cena"};
        ArrayAdapter<String> SpinnerAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Meals);
        spinnerMeals.setAdapter(SpinnerAdapter2);

/////////////////////////////////////////////////////////////////////////////////////////////
        //Creating the HasMap
        HashMap<String, Integer[]> Lunes = new HashMap<String, Integer[]>();
        Lunes.put("Pre Ejercicio", new Integer[] {1,20,3,56,3,5,65});
        Lunes.put("Desayuno", new Integer[] {11,0,33,536,36,57,6985});
        Lunes.put("Merienda AM", new Integer[] {1,20,3,56,3,5,65});
        Lunes.put("Almuerzo", new Integer[] {1,20,3,56,3,5,65});
        Lunes.put("Merienda PM", new Integer[] {1,20,3,56,3,5,65});
        Lunes.put("Cena", new Integer[] {1,20,3,56,3,5,65});

        HashMap<String, Integer[]> Martes = new HashMap<>();
        Martes.put("Pre Ejercicio", new Integer[] {11,20,3,56,3,5,65});
        Martes.put("Desayuno", new Integer[] {111,0,33,536,36,57,6985});
        Martes.put("Merienda AM", new Integer[] {11,20,3,56,3,5,65});
        Martes.put("Almuerzo", new Integer[] {12,20,3,56,3,5,65});
        Martes.put("Merienda PM", new Integer[] {21,20,3,56,3,5,65});
        Martes.put("Cena", new Integer[] {13,20,3,56,3,5,65});

        HashMap<String, Integer[]> Miercoles = new HashMap<>();
        Miercoles.put("Pre Ejercicio", new Integer[] {11,20,3,56,3,5,65});
        Miercoles.put("Desayuno", new Integer[] {111,0,33,536,36,57,6985});
        Miercoles.put("Merienda AM", new Integer[] {11,20,3,56,3,5,65});
        Miercoles.put("Almuerzo", new Integer[] {12,20,3,56,3,5,65});
        Miercoles.put("Merienda PM", new Integer[] {21,20,3,56,3,5,65});
        Miercoles.put("Cena", new Integer[] {13,20,3,56,3,5,65});

        HashMap<String, Integer[]> Jueves = new HashMap<>();
        Jueves.put("Pre Ejercicio", new Integer[] {11,20,3,56,3,5,65});
        Jueves.put("Desayuno", new Integer[] {111,0,33,536,36,57,6985});
        Jueves.put("Merienda AM", new Integer[] {11,20,3,56,3,5,65});
        Jueves.put("Almuerzo", new Integer[] {12,20,3,56,3,5,65});
        Jueves.put("Merienda PM", new Integer[] {21,20,3,56,3,5,65});
        Jueves.put("Cena", new Integer[] {13,20,3,56,3,5,65});

        HashMap<String, Integer[]> Viernes = new HashMap<>();
        Viernes.put("Pre Ejercicio", new Integer[] {11,20,3,56,3,5,65});
        Viernes.put("Desayuno", new Integer[] {111,0,33,536,36,57,6985});
        Viernes.put("Merienda AM", new Integer[] {11,20,3,56,3,5,65});
        Viernes.put("Almuerzo", new Integer[] {12,20,3,56,3,5,65});
        Viernes.put("Merienda PM", new Integer[] {21,20,3,56,3,5,65});
        Viernes.put("Cena", new Integer[] {13,20,3,56,3,5,65});

        HashMap<String, Integer[]> Sabado = new HashMap<>();
        Sabado.put("Pre Ejercicio", new Integer[] {11,20,3,56,3,5,65});
        Sabado.put("Desayuno", new Integer[] {111,0,33,536,36,57,6985});
        Sabado.put("Merienda AM", new Integer[] {11,20,3,56,3,5,65});
        Sabado.put("Almuerzo", new Integer[] {12,20,3,56,3,5,65});
        Sabado.put("Merienda PM", new Integer[] {21,20,3,56,3,5,65});
        Sabado.put("Cena", new Integer[] {13,20,3,56,3,5,65});

        HashMap<String, Integer[]> Domingo = new HashMap<>();
        Sabado.put("Pre Ejercicio", new Integer[] {11,20,3,56,3,5,65});
        Sabado.put("Desayuno", new Integer[] {111,0,33,536,36,57,6985});
        Sabado.put("Merienda AM", new Integer[] {11,20,3,56,3,5,65});
        Sabado.put("Almuerzo", new Integer[] {12,20,3,56,3,5,65});
        Sabado.put("Merienda PM", new Integer[] {21,20,3,56,3,5,65});
        Sabado.put("Cena", new Integer[] {13,20,3,56,3,5,65});
////////////////////////////////////////////////////////////////////////////////////////
        //Creating the HasMap
        HashMap<String, Integer[]> LunesRes = new HashMap<String, Integer[]>();
        LunesRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        LunesRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        LunesRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        LunesRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        LunesRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        LunesRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});

        HashMap<String, Integer[]> MartesRes = new HashMap<String, Integer[]>();
        MartesRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        MartesRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        MartesRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        MartesRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        MartesRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        MartesRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});

        HashMap<String, Integer[]> MiercolesRes = new HashMap<>();
        MiercolesRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        MartesRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        MiercolesRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        MiercolesRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        MiercolesRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        MiercolesRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});

        HashMap<String, Integer[]> JuevesRes = new HashMap<>();
        JuevesRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        JuevesRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        JuevesRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        JuevesRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        JuevesRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        JuevesRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});

        HashMap<String, Integer[]> ViernesRes = new HashMap<>();
        ViernesRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        ViernesRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        ViernesRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        ViernesRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        ViernesRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        ViernesRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});

        HashMap<String, Integer[]> SabadoRes = new HashMap<>();
        SabadoRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        SabadoRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        SabadoRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        SabadoRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        SabadoRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        SabadoRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});

        HashMap<String, Integer[]> DomingoRes = new HashMap<>();
        DomingoRes.put("Pre Ejercicio", new Integer[] {0,0,0,0,0,0,0});
        DomingoRes.put("Desayuno", new Integer[] {0,0,0,0,0,0,0});
        DomingoRes.put("Merienda AM", new Integer[] {0,0,0,0,0,0,0});
        DomingoRes.put("Almuerzo", new Integer[] {0,0,0,0,0,0,0});
        DomingoRes.put("Merienda PM", new Integer[] {0,0,0,0,0,0,0});
        DomingoRes.put("Cena", new Integer[] {0,0,0,0,0,0,0});
/////////////////////////////////////////////////////////////////////////////////////////
        Lac = findViewById(R.id.Lac);
        Fru = findViewById(R.id.Fru);
        Veg = findViewById(R.id.Veg);
        Har = findViewById(R.id.Har);
        Pro = findViewById(R.id.Pro);
        Gra = findViewById(R.id.Gra);
        Liq = findViewById(R.id.Liq);
        LacRes = findViewById(R.id.LacRes);
        FruRes = findViewById(R.id.FruRes);
        VegRes = findViewById(R.id.VegRes);
        HarRes = findViewById(R.id.HarRes);
        ProRes = findViewById(R.id.ProRes);
        GraRes = findViewById(R.id.GraRes);
        LiqRes = findViewById(R.id.LiqRes);

////////////////////////////////////////////////////////////////
        //SumLac
        SumLac = findViewById(R.id.SumLac);
        SumLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumLac(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumLac(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumLac(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumLac(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumLac(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumLac(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumLac(Domingo,DomingoRes,Meal);
                }
            }
        });

        //ResLac
        ResLac = findViewById(R.id.ResLac);
        ResLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResLac(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResLac(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResLac(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResLac(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResLac(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResLac(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResLac(Domingo,DomingoRes,Meal);
                }
            }
        });
////////////////////////////////////////////////////////////////////
        //SumFru
        SumFru = findViewById(R.id.SumFru);
        SumFru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumFru(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumFru(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumFru(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumFru(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumFru(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumFru(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumFru(Domingo,DomingoRes,Meal);
                }
            }
        });

        //ResFru
        ResFru = findViewById(R.id.ResFru);
        ResFru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResFru(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResFru(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResFru(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResFru(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResFru(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResFru(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResFru(Domingo,DomingoRes,Meal);
                }
            }
        });
///////////////////////////////////////////////////////////////////
        //SumVeg
        SumVeg = findViewById(R.id.SumVeg);
        SumVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumVeg(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumVeg(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumVeg(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumVeg(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumVeg(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumVeg(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumVeg(Domingo,DomingoRes,Meal);
                }
            }
        });

        //ResVeg
        ResVeg = findViewById(R.id.ResVeg);
        ResVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResVeg(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResVeg(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResVeg(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResVeg(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResVeg(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResVeg(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResVeg(Domingo,DomingoRes,Meal);
                }
            }
        });
///////////////////////////////////////////////////////////////////////
        //SumHar
        SumHar = findViewById(R.id.SumHar);
        SumHar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumHar(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumHar(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumHar(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumHar(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumHar(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumHar(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumHar(Domingo,DomingoRes,Meal);
                }
            }
        });

        //ResHar
        ResHar = findViewById(R.id.ResHar);
        ResHar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResHar(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResHar(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResHar(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResHar(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResHar(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResHar(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResHar(Domingo,DomingoRes,Meal);
                }
            }
        });
/////////////////////////////////////////////////////////////////////////
        //SumPro
        SumPro = findViewById(R.id.SumPro);
        SumPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumPro(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumPro(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumPro(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumPro(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumPro(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumPro(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumPro(Domingo,DomingoRes,Meal);
                }
            }
        });

        //ResPro
        ResPro = findViewById(R.id.ResPro);
        ResPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResPro(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResPro(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResPro(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResPro(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResPro(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResPro(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResPro(Domingo,DomingoRes,Meal);
                }

            }
        });
/////////////////////////////////////////////////////////////////////////
        //SumGra
        SumGra = findViewById(R.id.SumGra);
        SumGra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumGra(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumGra(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumGra(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumGra(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumGra(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumGra(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumGra(Domingo,Domingo,Meal);
                }
            }
        });

        //ResGra
        ResGra = findViewById(R.id.ResGra);
        ResGra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResGra(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResGra(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResGra(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResGra(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResGra(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResGra(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResGra(Domingo,DomingoRes,Meal);
                }
            }
        });
//////////////////////////////////////////////////////////////////////////
        //SumLiq
        SumLiq = findViewById(R.id.SumLiq);
        SumLiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    SumLiq(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    SumLiq(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    SumLiq(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    SumLiq(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    SumLiq(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    SumLiq(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    SumLiq(Domingo,DomingoRes,Meal);
                }
            }
        });

        //ResLiq
        ResLiq = findViewById(R.id.ResLiq);
        ResLiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();
                if (Dia == "Lunes"){
                    ResLiq(Lunes,LunesRes,Meal);
                }
                if (Dia == "Martes"){
                    ResLiq(Martes,MartesRes,Meal);
                }
                if (Dia == "Miercoles"){
                    ResLiq(Miercoles,MiercolesRes,Meal);
                }
                if (Dia == "Jueves"){
                    ResLiq(Jueves,JuevesRes,Meal);
                }
                if (Dia == "Viernes"){
                    ResLiq(Viernes,ViernesRes,Meal);
                }
                if (Dia == "Sabado"){
                    ResLiq(Sabado,SabadoRes,Meal);
                }
                if (Dia == "Domingo"){
                    ResLiq(Domingo,DomingoRes,Meal);
                }
            }
        });
//////////////////////////////////////////////////////////////////////////

        //Aceptar
        Aceptar = (Button) findViewById(R.id.Aceptar);
        Aceptar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //Getting inputs
                String Dia = spinnerDays.getSelectedItem().toString();
                String Meal = spinnerMeals.getSelectedItem().toString();

                if(Dia == "Lunes"){
                    SettingMeals(Meal,Lunes,LunesRes);
                }
                else if(Dia == "Martes"){
                    SettingMeals(Meal,Martes,MartesRes);
                }
                else if(Dia == "Miercoles"){
                    SettingMeals(Meal,Miercoles,MiercolesRes);
                }
                else if(Dia == "Jueves"){
                    SettingMeals(Meal,Jueves,JuevesRes);
                }
                else if(Dia == "Viernes"){
                    SettingMeals(Meal,Viernes,ViernesRes);
                }
                else if(Dia == "Sabado"){
                    SettingMeals(Meal,Sabado,SabadoRes);
                }
                else if(Dia == "Domingo"){
                    SettingMeals(Meal,Domingo,DomingoRes);
                }
                else {
                    //Put a message
                }

            }
        });

//////////////////////////////////////////////////////////////////////////////

        //Lacteos
        Dialog = new Dialog(this);
        Lacteos = findViewById(R.id.Lacteos);
        Lacteos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowLacteosPopUp();
            }
        });
        //Vegetales
        Vegetales = findViewById(R.id.Vegetales);
        Vegetales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowVegetalesPopUp();
            }
        });
        //Frutas
        Frutas = findViewById(R.id.Frutas);
        Frutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    ShowFrutasPopUp();
            }
        });
        //Harinas
        Harinas = findViewById(R.id.Harinas);
        Harinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowHarinasPopUp();
            }
        });
        //Harinas
        Proteinas = findViewById(R.id.Proteinas);
        Proteinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowProteinasPopUp();
            }
        });
        //Grasas
        Grasas = findViewById(R.id.Grasas);
        Grasas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGrasasPopUp();
            }
        });
        //Liquidos
        Liquidos = findViewById(R.id.Liquidos);
        Liquidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowLiquidosPopUp();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void SettingMeals(String Meal, HashMap Map, HashMap MapRes){
        Lac.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[0] ) );
        Fru.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[1] ) );
        Veg.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[2] ) );
        Har.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[3] ) );
        Pro.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[4] ) );
        Gra.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[5] ) );
        Liq.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(Map.get(Meal)))[6] ) );

        LacRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[0] ) );
        FruRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[1] ) );
        VegRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[2] ) );
        HarRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[3] ) );
        ProRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[4] ) );
        GraRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[5] ) );
        LiqRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(MapRes.get(Meal)))[6] ) );
    }

    private void SumLac(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[0] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[0] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[0] += 1;
            LacRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[0] ) );
        //}
    }
    private void ResLac(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[0] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[0] -= 1;
            LacRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[0] ) );
        }
    }

    private void SumFru(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[1] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[1] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[1] += 1;
            FruRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[1] ) );
        //}
    }
    private void ResFru(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[1] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[1] -= 1;
            FruRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[1] ) );
        }
    }

    private void SumVeg(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[2] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[2] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[2] += 1;
            VegRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[2] ) );
        //}
    }
    private void ResVeg(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[2] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[2] -= 1;
            VegRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[2] ) );
        }
    }

    private void SumHar(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[3] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[3] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[3] += 1;
            HarRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[3] ) );
        //}
    }
    private void ResHar(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[3] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[3] -= 1;
            HarRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[3] ) );
        }
    }

    private void SumPro(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[4] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[4] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[4] += 1;
            ProRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[4] ) );
        //}
    }
    private void ResPro(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[4] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[4] -= 1;
            ProRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[4] ) );
        }
    }

    private void SumGra(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[5] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[5] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[5] += 1;
            GraRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[5] ) );
        //}
    }
    private void ResGra(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[5] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[5] -= 1;
            GraRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[5] ) );
        }
    }

    private void SumLiq(HashMap Day, HashMap DayRes, String Meal){
        //if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[6] < ((Integer[]) Objects.requireNonNull(Day.get(Meal)))[6] ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[6] += 1;
            LiqRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[6] ) );
        //}
    }
    private void ResLiq(HashMap Day, HashMap DayRes, String Meal){
        if ( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[6] > 0 ){
            ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[6] -= 1;
            LiqRes.setText(  Integer.toString( ((Integer[]) Objects.requireNonNull(DayRes.get(Meal)))[6] ) );
        }
    }

    public void ShowLacteosPopUp(){
        Dialog.setContentView(R.layout.lacteos_poup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
    public void ShowVegetalesPopUp(){
        Dialog.setContentView(R.layout.vegetales_popup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
    public void ShowFrutasPopUp(){
        Dialog.setContentView(R.layout.frutas_popup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
    public void ShowHarinasPopUp(){
        Dialog.setContentView(R.layout.harinas_popup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
    public void ShowProteinasPopUp(){
        Dialog.setContentView(R.layout.proteinas_popup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
    public void ShowGrasasPopUp(){
        Dialog.setContentView(R.layout.grasas_popup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
    public void ShowLiquidosPopUp(){
        Dialog.setContentView(R.layout.liquidos_popup);
        CloseLac = (ImageView) Dialog.findViewById(R.id.CloseLac);
        CloseLac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.dismiss();
            }
        });
        Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Dialog.show();
    }
}