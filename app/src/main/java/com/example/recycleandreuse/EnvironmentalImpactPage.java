package com.example.recycleandreuse;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EnvironmentalImpactPage extends AppCompatActivity {

    TextView EnvironmentalImpactTV1J, EnvironmentalImpactTV2J, EnvironmentalImpactTV3J, EnvironmentalImpactTV4J, EnvironmentalImpactTV5J, EnvironmentalImpactTV6J;
    ImageView EnvironmentalImpactIV1J, EnvironmentalImpactIV2J, EnvironmentalImpactIV3J;
    Button PlayMusicButtonJ;
    WebView webViewJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environmental_impact_page);

        EnvironmentalImpactTV1J = findViewById(R.id.EnvironmentalImpactTV1);
        EnvironmentalImpactTV2J = findViewById(R.id.EnvironmentalImpactTV2);
        EnvironmentalImpactTV3J = findViewById(R.id.EnvironmentalImpactTV3);
        EnvironmentalImpactTV4J = findViewById(R.id.EnvironmentalImpactTV4);
        EnvironmentalImpactTV5J = findViewById(R.id.EnvironmentalImpactTV5);
        EnvironmentalImpactTV6J = findViewById(R.id.EnvironmentalImpactTV6);

        EnvironmentalImpactIV1J = findViewById(R.id.EnvironmentalImpactIV1);
        EnvironmentalImpactIV2J = findViewById(R.id.EnvironmentalImpactIV2);
        EnvironmentalImpactIV3J = findViewById(R.id.EnvironmentalImpactIV3);

        PlayMusicButtonJ = findViewById(R.id.PlayMusicButton);
        PlayMusicButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(EnvironmentalImpactPage.this, R.raw.earth);
                mp.start();
                mp.setLooping(true);
            }
        });

        webViewJ = (WebView) findViewById(R.id.webView);
        webViewJ.getSettings().setJavaScriptEnabled(true);
        webViewJ.loadUrl("https://www.carbonfootprint.com/calculator.aspx");

    }
}