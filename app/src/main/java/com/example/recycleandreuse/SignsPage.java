package com.example.recycleandreuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SignsPage extends AppCompatActivity {

    TextView SignsTV1J, SignsTV2J;
    ImageView SignsIV1J, SignsIV2J, SignsIV3J, SignsIV4J, SignsIV5J;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs_page);

        SignsTV1J = findViewById(R.id.SignsTV1);
        SignsTV2J = findViewById(R.id.SignsTV2);

        SignsIV1J = findViewById(R.id.SignsIV1);
        SignsIV2J = findViewById(R.id.SignsIV2);
        SignsIV3J = findViewById(R.id.SignsIV3);
        SignsIV4J = findViewById(R.id.SignsIV4);
        SignsIV5J = findViewById(R.id.SignsIV5);
    }
}