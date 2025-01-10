package com.example.formscontrol;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText value;

    Button submit;

    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        value=findViewById(R.id.number);
        submit=findViewById(R.id.btn);
        answer=findViewById(R.id.answer);

    submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data = Integer.parseInt(value.getText().toString());
                int multi = 1;
                String solution="";
                for (int i = 1; i <= 10; i++) {
                    multi = i * data;
                    solution += i + "*" + data + "=" + multi + "\n";
                }
                answer.setText(solution);
            }

        });
    }
}