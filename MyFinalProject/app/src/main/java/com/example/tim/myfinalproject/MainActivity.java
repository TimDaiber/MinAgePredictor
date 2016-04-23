package com.example.tim.myfinalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    public int getAge1() {
        return age;
    }

    public void setAge1(int age) {
        this.age = age;
    }

    public int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.Weight,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner = (Spinner) findViewById(R.id.spinner2);
        adapter = ArrayAdapter.createFromResource(this,R.array.Gender,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner = (Spinner) findViewById(R.id.spinner3);
        adapter = ArrayAdapter.createFromResource(this,R.array.Food,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner = (Spinner) findViewById(R.id.spinner4);
        adapter = ArrayAdapter.createFromResource(this,R.array.Country,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner = (Spinner) findViewById(R.id.spinner5);
        adapter = ArrayAdapter.createFromResource(this,R.array.Alcohol,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner = (Spinner) findViewById(R.id.spinner6);
        adapter = ArrayAdapter.createFromResource(this,R.array.Outlook,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


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



    public void  buttonOnClick(View v){
        age=85;
        Button button = (Button) v;
        CheckBox smoker = (CheckBox) findViewById(R.id.smoker);
        if(smoker.isChecked()){
            age = age -13;
            setAge1(age);
        }


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String myweight = spinner.getSelectedItem().toString();

        if(myweight.equals("Average")){
            age = age;
        }
        else if(myweight.equals("Obese")){
            age = age-7;
        }
        else if(myweight.equals("Overweight")){
            age = age-5;
        }
        else if(myweight.equals("Underweight")){
            age=age-3;
            setAge1(age);
        }
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        String gender = spinner2.getSelectedItem().toString();
        if(gender.equals("Man")){
            age = age-7;
        }

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        String eating = spinner3.getSelectedItem().toString();
        if(eating.equals("Very Healthy")){
            age = age+2;
        }
        else if(eating.equals("Healthy")){
            age = age+1;
        }
        else if(eating.equals("Normal")){
            age = age;
        }
        else if(eating.equals("Unhealthy")){
            age=age-2;
            setAge1(age);
        }
        else if(eating.equals("Fast food only")){
            age=age-4;
            setAge1(age);
        }
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        String country = spinner4.getSelectedItem().toString();
        if(country.equals("First World")){
            age = age;
        }
        else if(country.equals("Second World")){
            age = age-6;
        }
        else if(country.equals("Third World")){
            age = age-10;
        }
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        String alcohol = spinner5.getSelectedItem().toString();
        if(alcohol.equals("Never")){
            age = age;
        }
        else if(alcohol.equals("Monthly")){
            age = age-1;
        }
        else if(alcohol.equals("Weekly")){
            age = age-3;
        }
        else if(alcohol.equals("Like a Fish")) {
            age = age - 6;
            setAge1(age);
        }
        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        String outlook = spinner6.getSelectedItem().toString();
        if(outlook.equals("Optimistic")){
            age = age;
        }
        else if(outlook.equals("Neutral")){
            age = age-1;
        }
        else if(outlook.equals("Pessimistic")){
            age = age-2;
        }
        //MainActivity main = new MainActivity();
        //main.setAge1(age);
        int newage = age;
        ((Button)v).setText("" + newage);
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("parameter name",newage);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
