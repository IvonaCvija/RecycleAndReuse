package com.example.recycleandreuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView RecycleAndReuseTVJ, RAndRTV2J;
    Button HowYouCanHelpButtonJ, EnvironmentalImpactButtonJ, BestRecyclingCountriesButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecycleAndReuseTVJ = findViewById(R.id.RecycleAndReuseTV);
        RAndRTV2J = findViewById(R.id.RAndRTV2);

        HowYouCanHelpButtonJ = findViewById(R.id.HowYouCanHelpButton);
        HowYouCanHelpButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HowYouCanHelpPage.class));
            }
        });

        EnvironmentalImpactButtonJ = findViewById(R.id.EnvironmentalImpactButton);
        EnvironmentalImpactButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EnvironmentalImpactPage.class));
            }
        });

        BestRecyclingCountriesButtonJ = findViewById(R.id.BestRecyclingCountriesButton);
        BestRecyclingCountriesButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BestRecyclingCountriesPage.class));
            }
        });
    }
}