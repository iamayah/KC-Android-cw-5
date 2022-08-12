package com.example.acw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView appname = findViewById(R.id.appname2);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        ImageView dzdz = findViewById(R.id.dd);
        Button next = findViewById(R.id.next);
        TextView e = findViewById(R.id.cc);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = name.getText().toString();
                String a = age.getText().toString();

                Intent intent = new Intent(MainActivity.this, screen2.class);
                intent.putExtra("nn", n );
                intent.putExtra("aa", a );
                startActivity(intent);

            }
        });


    }
}