package com.example.formscontrol;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    TextView n;

    TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        n=(TextView) findViewById(R.id.namehere);
        a=(TextView) findViewById(R.id.agehere);

        Bundle bundle= new Bundle(getIntent().getExtras());

        String value1= bundle.getString("name");
        String value2= bundle.getString("age");

        n.setText(value1);
        a.setText(value2);


    }
}