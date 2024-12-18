package com.suii.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.suii.newcalculator.MainActivity;
import com.suii.newcalculator.R;

public class subb extends AppCompatActivity {
    Button b1,b2;
    EditText et1,et2,et3;
    String s1,s2,result;
    int n1,n2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subb);
        et1=(EditText) findViewById(R.id.numm1);
        et2=(EditText) findViewById(R.id.numm2);
        et3=(EditText) findViewById(R.id.res);
        b1=(Button) findViewById(R.id.subb);
        b2=(Button) findViewById(R.id.gobb);
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
                res=n1-n2;
                result=String.valueOf(res);
                et3.setText(result);

            }
        });


    }
}