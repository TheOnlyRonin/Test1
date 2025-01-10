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

public class MainActivity5 extends AppCompatActivity {
Button btn;

EditText ndata,adata;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        btn=(Button) findViewById(R.id.btn);
        ndata=(EditText) findViewById(R.id.name);
        adata=(EditText) findViewById(R.id.details);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v1=ndata.getText().toString();
                String v2=adata.getText().toString();

                Intent i=new Intent(MainActivity5.this, MainActivity6.class);

                i.putExtra("name", v1);
                i.putExtra("age", v2);

                startActivity(i);


            }
        });

    }
}