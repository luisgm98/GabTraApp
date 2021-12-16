package com.pe.gabtraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Options extends AppCompatActivity {

    android.app.Dialog Dialog;

    List<String> ChildList;
    Map<String,List<String>> ParentListItems;
    ExpandableListView expandableListView;

    List<String> ParentList = new ArrayList<>();
    {
        ParentList.add("Desayunos + bebida (café/té)");
        ParentList.add("Meriendas para días con ejercicio");
        ParentList.add("Meriendas cuando no hace ejercicio");

    };

    String[] Desayunos = {
            "Avena con fruta","Huevos rancheros","Pan pita relleno con omellete","Sincronizadas"
    };

    String[] MerConEjerc = {
            "Batido de frutas en leche","Parfait con frutos rojos", "Ensalada de frutas con gelatina y helado de yogurt"
    };

    String[] MerSinEjerc = {
            "Brochetas capresse","Batido verde","Batido antioxidante"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList) {
            if (HoldItem.equals("Desayunos + bebida (café/té)")){
                loadChild(Desayunos);
            } else if(HoldItem.equals("Meriendas para días con ejercicio")) {
                loadChild(MerConEjerc);
            } else
                loadChild(MerSinEjerc);

            ParentListItems.put(HoldItem, ChildList);
        }

        expandableListView = findViewById(R.id.expandListView);
        final ExpandableListAdapter expandableListAdapter = new ListAdapter(this, ParentList, ParentListItems);
        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter.getChild(groupPosition,childPosition);

                Intent intent;

                switch (selected) {
                    case "Avena con fruta":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Avena con fruta");
                        intent.putExtra("Description","½ taza de avena con 1 taza de leche descremada con 1 cdta de canela + 1 taza de frutas");
                        intent.putExtra("Image",R.drawable.avenaconfruta);
                        startActivity(intent);
                        break;
                    case "Huevos rancheros":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Huevos rancheros");
                        intent.putExtra("Description","2 huevos fritos + 1 taza de salsa ranchera (tomate, chile, cebolla, culantro, apio, pimienta y sal) + 4 tortillas gruesitas + ½ unidad de aguacate.");
                        intent.putExtra("Image",R.drawable.huevosranch);
                        startActivity(intent);
                        break;
                    case "Pan pita relleno con omellete":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Pan pita relleno con omellete");
                        intent.putExtra("Description","Rellenar el pan pita con 2 huevos revueltos con chile, cebolla, culantro y tomate.");
                        intent.putExtra("Image",R.drawable.pitaomelette);
                        startActivity(intent);
                        break;
                    case "Sincronizadas":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Sincronizadas");
                        intent.putExtra("Description","1 tortilla integral grande de bimbo con 3 rebanadas de queso blanco con 3 rebanadas de jamón de pavo light con hongos rebanados y puede acompañar con ½ taza de pico de gallo.");
                        intent.putExtra("Image",R.drawable.sincronizada);
                        startActivity(intent);
                        break;
                    case "Batido de frutas en leche":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Batido de frutas en leche");
                        intent.putExtra("Description","250ml de leche descremada + 1 taza de fruta.");
                        intent.putExtra("Image",R.drawable.batidofrutas);
                        startActivity(intent);
                        break;
                    case "Parfait con frutos rojos":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Parfait con frutos rojos");
                        intent.putExtra("Description","1 taza de yogurt griego, 3cdas de granola y ½ taza de frutos rojos.");
                        intent.putExtra("Image",R.drawable.parfait);
                        startActivity(intent);
                        break;
                    case "Ensalada de frutas con gelatina y helado de yogurt":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Ensalada de frutas con gelatina y helado de yogurt");
                        intent.putExtra("Description","1 taza de frutas, 1 taza de gelatina sin azúcar y 2 bolitas de helado de yogurt in line dos pinos.");
                        intent.putExtra("Image",R.drawable.ensaladafrutas);
                        startActivity(intent);
                        break;
                    case "Brochetas capresse":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Brochetas capresse");
                        intent.putExtra("Description","6tomates cherry, 6 cuadritos de queso blanco tipo turrilaba con 12 hojitas de albahaca y 1cdta de pesto.");
                        intent.putExtra("Image",R.drawable.capresse);
                        startActivity(intent);
                        break;
                    case "Batido verde":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Batido verde");
                        intent.putExtra("Description","1 rodaja de piña, 150ml de jugo de naranja natural, 150ml de agua, 5hojas de espancas, 5 rodajas de pepino, 1ramita de apio y otra de perejil.");
                        intent.putExtra("Image",R.drawable.batidoverde);
                        startActivity(intent);
                        break;
                    case "Batido antioxidante":
                        intent = new Intent (Options.this,OptionsMenu.class);
                        intent.putExtra("Title","Batido antioxidante");
                        intent.putExtra("Description","150ml de jugo de naranja con ¼ taza de zanahoria y ¼ taza de remolacha + 100ml de agua (licuar y consumir de inmediato).");
                        intent.putExtra("Image",R.drawable.batidoantioxidante);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    private void loadChild(String[] ParentElementName) {

        ChildList = new ArrayList<>();
        Collections.addAll(ChildList,ParentElementName);
    }
}