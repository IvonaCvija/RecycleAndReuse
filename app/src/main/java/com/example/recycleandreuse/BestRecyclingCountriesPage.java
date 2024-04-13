package com.example.recycleandreuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BestRecyclingCountriesPage extends AppCompatActivity {

    TextView BestRecyclingCountriesTV1J, BestRecyclingCountriesTV2J, BestRecyclingCountriesTV3J, BestRecyclingCountriesTV4J, BestRecyclingCountriesTV5J, BestRecyclingCountriesTV6J, BestRecyclingCountriesTV7J,
            BestRecyclingCountriesTV8J, BestRecyclingCountriesTV9J, BestRecyclingCountriesTV10J, BestRecyclingCountriesTV11J;
    ImageView BestRecyclingCountriesIV1J, BestRecyclingCountriesIV2J, BestRecyclingCountriesIV3J, BestRecyclingCountriesIV4J, BestRecyclingCountriesIV5J;
    Button BestRecyclingCountriesMoreButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_recycling_countries_page);

        BestRecyclingCountriesTV1J = findViewById(R.id.BestRecyclingCountriesTV1);
        BestRecyclingCountriesTV2J = findViewById(R.id.BestRecyclingCountriesTV2);
        BestRecyclingCountriesTV3J = findViewById(R.id.BestRecyclingCountriesTV3);
        BestRecyclingCountriesTV4J = findViewById(R.id.BestRecyclingCountriesTV4);
        BestRecyclingCountriesTV5J = findViewById(R.id.BestRecyclingCountriesTV5);
        BestRecyclingCountriesTV6J = findViewById(R.id.BestRecyclingCountriesTV6);
        BestRecyclingCountriesTV7J = findViewById(R.id.BestRecyclingCountriesTV7);
        BestRecyclingCountriesTV8J = findViewById(R.id.BestRecyclingCountriesTV8);
        BestRecyclingCountriesTV9J = findViewById(R.id.BestRecyclingCountriesTV9);
        BestRecyclingCountriesTV10J = findViewById(R.id.BestRecyclingCountriesTV10);
        BestRecyclingCountriesTV11J = findViewById(R.id.BestRecyclingCountriesTV11);

        BestRecyclingCountriesIV1J = findViewById(R.id.BestRecyclingCountriesIV1);
        BestRecyclingCountriesIV2J = findViewById(R.id.BestRecyclingCountriesIV2);
        BestRecyclingCountriesIV3J = findViewById(R.id.BestRecyclingCountriesIV3);
        BestRecyclingCountriesIV4J = findViewById(R.id.BestRecyclingCountriesIV4);
        BestRecyclingCountriesIV5J = findViewById(R.id.BestRecyclingCountriesIV5);

        BestRecyclingCountriesMoreButtonJ = findViewById(R.id.BestRecyclingCountriesMoreButton);
        BestRecyclingCountriesMoreButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.willshees.co.uk/news/the-top-25-countries-for-recycling-interactive-map/"));
                startActivity(browserIntent);
            }
        });

    }
}