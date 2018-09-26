package com.memesinfo.memesinfoo;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Desde la otra activity, dentro de OnCreate la lees con

        Bundle bundle= getIntent().getExtras();
        ListadoFragExt fragmentExtended=new ListadoFragExt();
        fragmentExtended.setArguments(bundle);


        getSupportFragmentManager()
                .beginTransaction().replace (R.id.container2, fragmentExtended)
                .commit ();
    }
}
