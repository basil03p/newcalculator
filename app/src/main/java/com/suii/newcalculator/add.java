package com.suii.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class add extends AppCompatActivity {
    Button b1,b2;
    EditText et1,et2,et3;
    String s1,s2,result;
    int n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        et1=(EditText) findViewById(R.id.num1);
        et2=(EditText) findViewById(R.id.num2);
        et3=(EditText) findViewById(R.id.res);
        b1=(Button) findViewById(R.id.addc);
        b2=(Button) findViewById(R.id.gob);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        s1=et1.getText().toString();
        s2=et2.getText().toString();
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        sum=n1+n2;
        result=String.valueOf(sum);
        et3.setText(result);

            }
        });


    }
}