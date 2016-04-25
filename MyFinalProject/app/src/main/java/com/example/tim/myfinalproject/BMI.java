package com.example.tim.myfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
public String res = "";
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View v){
        EditText edit1 = (EditText)findViewById(R.id.editText);
        EditText edit2 = (EditText)findViewById(R.id.editText2);
        TextView textView14 = (TextView)findViewById(R.id.textView14);
        TextView textView12 = (TextView)findViewById(R.id.textView12);
        String sheight = (edit1.getText().toString());

        float height = Integer.parseInt(sheight);

        String sweight = (edit2.getText().toString());

        float weight = Integer.parseInt(sweight);

        height = height/100;

        float newheight = height*height;

        float bmi= weight/newheight;

        textView12.setText(""+bmi);

        if(bmi<18.5){
            res = "Underweight";
        }else if(bmi>18.5&&bmi<=24.9){
            res = "Average";
        }else if(bmi>=25&&bmi<=29.9){
            res = "Overweight";
        }
        else if(bmi>=30){
            res = "Obese";
        }
        textView14.setText(res);

         intent2 = new Intent(getApplicationContext(), MainActivity.class);
        intent2.putExtra("parameter name", res);
        //startActivity(intent);
    }
    public void returnMain(View v){
         intent2 = new Intent(getApplicationContext(), MainActivity.class);
        intent2.putExtra("Weight class", res);
        startActivity(intent2);
    }
}
