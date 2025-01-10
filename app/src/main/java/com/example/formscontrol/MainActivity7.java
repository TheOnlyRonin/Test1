package com.example.formscontrol;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {

    Button btn;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        btn=(Button) findViewById(R.id.btn);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.parseFloat(num1.getText().toString());
                float n2=Float.parseFloat(num2.getText().toString());

                Intent i=new Intent(MainActivity7.this, MainActivity8.class);

                i.putExtra("num1", n1);
                i.putExtra("num2", n2);
                startActivity(i);
            }
        });

    }
}