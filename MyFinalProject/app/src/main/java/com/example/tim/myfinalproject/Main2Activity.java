package com.example.tim.myfinalproject;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button viewDetails ;
    DatabaseHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewDetails =(Button) findViewById(R.id.button3);


        //MainActivity main = new MainActivity();
        //TextView calculated = (TextView) findViewById(R.id.calculated);
        Intent intent = getIntent();
        int myage = intent.getIntExtra("parameter name", 0);
        TextView calculate = (TextView) findViewById(R.id.calculated);

        calculate.setText("" + myage);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        myDB = new DatabaseHelper(this);
    }



    public void viewData(View v){
        //Button button = (Button) v;
         Cursor res = myDB.getAllData();
        if(res.getCount()==0){
            // show message
            showMessage("Error","No Data Fount");
            return;
        }
        else
        {
            StringBuffer buffer = new StringBuffer();

            while(res.moveToNext())
            {
                buffer.append("ID :" + res.getString(0)+"\n");
                buffer.append("Name :" + res.getString(1)+"\n");
                buffer.append("Smoker :" + res.getString(2)+"\n");
                buffer.append("Weight :" + res.getString(3)+"\n");
                buffer.append("Gender :" + res.getString(4)+"\n");
                buffer.append("Eating :" + res.getString(5)+"\n");
                buffer.append("Country :" + res.getString(6)+"\n");
                buffer.append("Alcohol :" + res.getString(7)+"\n");
                buffer.append("Outlook :" + res.getString(8)+"\n");
                buffer.append("Age :" + res.getInt(9)+"\n\n");

                // SHow it
                showMessage("Data",buffer.toString());
            }
        }
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.setNegativeButton("Ok",null);
        builder.show();
    }
    public void averageAge(View v){
        Cursor res = myDB.getAverageAge();
        if(res.getCount()==0){
            // show message
            showMessage("Error","No Data Fount");
            return;
        }
        else
        {
            StringBuffer buffer = new StringBuffer();

            while(res.moveToNext())
            {
                buffer.append("Average Age of gathered date : \n" + res.getString(0)+"\n");


                // SHow it
                showMessage("Data",buffer.toString());
            }
        }
    }
}
