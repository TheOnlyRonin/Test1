package com.example.formscontrol;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    RadioButton male,female,others;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        others=findViewById(R.id.others);

        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, " " + checkGender(), Toast.LENGTH_SHORT).show();
            }
            });

    }


private String checkGender(){
    String gender="";
    if(male.isChecked()){
        gender = "Male";
    }
    else if (female.isChecked()) {
        gender = "Female";
    }
    else if (others.isChecked()) {
        gender = "Others";
    }
    else {
        gender = "Please Select a Gender";
    }
    return gender;

}
}