package com.example.acw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        ImageView d = findViewById(R.id.dd);
        TextView appname = findViewById(R.id.appname2);
        TextView cc = findViewById(R.id.cc);
        TextView tname = findViewById(R.id.tname);
        TextView tage = findViewById(R.id.tage);

        Bundle bundle = getIntent().getExtras();

        String n = bundle.getString("nn");
        tname.setText(n);

        String a = bundle.getString("aa");
        tage.setText(a);

    }
}