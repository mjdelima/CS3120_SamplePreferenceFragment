package com.cardinalplayground.samplepreferencefragment;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;

import android.os.Bundle;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        MyPref_Frag myPref_frag = new MyPref_Frag();
        fragmentTransaction.replace(android.R.id.content, myPref_frag);
        fragmentTransaction.commit();

    }
}