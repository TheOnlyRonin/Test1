package com.example.formscontrol;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {
    TextView answer;

    int sum,sub,mul;

    float div;

    String solutions="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);

        answer=(TextView) findViewById(R.id.ans);


                Bundle bundle=new Bundle(getIntent().getExtras());

            float a=bundle.getFloat("num1");
            float b=bundle.getFloat("num2");


            sum=(int) (a+b);
            sub=(int) (a-b);
            mul=(int) (a*b);
            div=a/b;


            solutions = " Addition = "+ sum +
                    "\n Difference = "+ sub +
                    "\n Product = "+ mul +
                    "\n Quotient = "+ div ;
            answer.setText(solutions);

        }
    }