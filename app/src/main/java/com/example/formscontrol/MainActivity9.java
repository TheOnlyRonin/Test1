package com.example.formscontrol;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(MainActivity9.this, MainActivity7.class);
                startActivity(i);
                finish();
            }

        }, 3000);
    }
}