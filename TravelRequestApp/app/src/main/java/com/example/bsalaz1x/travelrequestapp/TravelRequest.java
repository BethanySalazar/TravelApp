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


public class TravelRequest extends Activity {

    private Button submit;

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



}