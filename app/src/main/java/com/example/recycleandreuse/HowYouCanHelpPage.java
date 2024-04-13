package com.example.recycleandreuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HowYouCanHelpPage extends AppCompatActivity {

    TextView YouHelpTV1J, YouHelpTV2J, YouHelpTV3J, YouHelpTV4J, YouHelpTV5J;
    ImageView YouHelpIV1J, YouHelpIV2J, YouHelpIV3J;
    Button YouHelpButtonJ;
    ImageButton YouHelpImButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_you_can_help_page);

        YouHelpTV1J = findViewById(R.id.YouHelpTV1);
        YouHelpTV2J = findViewById(R.id.YouHelpTV2);
        YouHelpTV3J = findViewById(R.id.YouHelpTV3);
        YouHelpTV4J = findViewById(R.id.YouHelpTV4);
        YouHelpTV5J = findViewById(R.id.YouHelpTV5);

        YouHelpIV1J = findViewById(R.id.YouHelpIV1);
        YouHelpIV2J = findViewById(R.id.YouHelpIV2);
        YouHelpIV3J = findViewById(R.id.YouHelpIV3);

        YouHelpButtonJ = findViewById(R.id.YouHelpButton);
        YouHelpButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://crni.ie/about-reuse-recycling/"));
                startActivity(browserIntent);
            }
        });

        YouHelpImButtonJ = findViewById(R.id.YouHelpImButton);
        YouHelpImButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HowYouCanHelpPage.this, SignsPage.class));
            }
        });
    }
}