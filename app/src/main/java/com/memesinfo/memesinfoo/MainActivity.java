package com.memesinfo.memesinfoo;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMemeTouchedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se crea el fragment con el container
        getSupportFragmentManager()
                .beginTransaction().replace (R.id.container, new ListadoFragment ())
                .setTransition (FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit ();
    }

    @Override
    public void onMemeTouched(int idMeme,int idImg) {
        Intent otraActividad = new Intent(this,Main2Activity.class);

        //Para enviar parametros a la otra activity
        otraActividad.putExtra("idMeme",idMeme);
        otraActividad.putExtra("idImg",idImg);
        startActivity(otraActividad);


    }
}
