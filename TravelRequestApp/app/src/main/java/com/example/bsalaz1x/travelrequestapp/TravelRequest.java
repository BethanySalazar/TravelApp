package com.example.bsalaz1x.travelrequestapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.ArrayList;


public class TravelRequest extends Activity {

    private Button submit;
    double totalBudget = 0.00;
    ArrayList BUgroup = new ArrayList();

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_request);

        submit = (Button) findViewById(R.id.submit_button);

        submit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick (View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Thank you, your travel request has been submitted.", Toast.LENGTH_LONG).show();

            }
        });
    }


    /*public void budget(EditText view, View view2, ArrayList list){

        EditText trip_budget = (EditText) findViewById(R.id.est_trip_budget);
        String string_budget = (trip_budget.getText()).toString();

        //double num_budget = Double.parseDouble(trip_budget.getText()).toString();


    }*/



}