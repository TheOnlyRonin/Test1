package com.example.formscontrol;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    EditText name, email, phone, password;

    CheckBox check;

    RadioButton male, female, others;

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        password=findViewById(R.id.password);

        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        others=findViewById(R.id.others);

        check=findViewById(R.id.checkbox);

        btn=findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (error()) {
                    Intent i=new Intent(MainActivity3.this, MainActivity4.class);
                    startActivity(i);
                    Toast.makeText(MainActivity3.this, "Validation Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private Boolean error(){

        if(name.getText().toString().trim().isEmpty() || phone.getText().toString().trim().isEmpty() || email.getText().toString().trim().isEmpty() || password.getText().toString().trim().isEmpty()){
            Toast.makeText(MainActivity3.this, "Fields should not be empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (phone.getText().toString().length()!=10){
            Toast.makeText(MainActivity3.this, "Phone Number should be 10 digits", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
            Toast.makeText(MainActivity3.this, "Inavlid Email address", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!password.getText().toString().matches("^[a-zA-Z0-9]{8}$")){
            Toast.makeText(MainActivity3.this, "Password must be exactly 8 characters long and include only letters and numbers", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!male.isChecked() && !female.isChecked() && !others.isChecked()){
            Toast.makeText(MainActivity3.this, "Please select a gender", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(!check.isChecked()){
            Toast.makeText(MainActivity3.this, "Please accept terms and conditions", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }



}