package com.example.formscontrol;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity10 extends AppCompatActivity {

    EditText name, password;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main10);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.btn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (error()) {
                    Intent i = new Intent(MainActivity10.this, MainActivity9.class);
                    startActivity(i);
                    Toast.makeText(MainActivity10.this, "Validation Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private Boolean error() {

        if (name.getText().toString().trim().isEmpty() || password.getText().toString().trim().isEmpty()) {
            Toast.makeText(MainActivity10.this, "Fields should not be empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!password.getText().toString().matches("^[a-zA-Z0-9]{8}$")) {
            Toast.makeText(MainActivity10.this, "Password must be exactly 8 characters long and include only letters and numbers", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
