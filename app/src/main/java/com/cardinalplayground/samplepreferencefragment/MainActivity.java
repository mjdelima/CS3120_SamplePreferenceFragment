package com.cardinalplayground.samplepreferencefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSettings;
    TextView tvData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSettings = findViewById(R.id.btnSettings);
        tvData = findViewById(R.id.tvData);


        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Settings.class);
                MainActivity.this.startActivity(i);
            }
        });

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String username = sharedPreferences.getString("KEY_USERNAME", "");
        String ringtone = sharedPreferences.getString("KEY_RINGTONE", "");
        tvData.setText("Hello: " + username + "\n" + "Your selected ringtone: " + ringtone );
        loadData();

    }

    private void loadData() {

    }
}