package com.example.comp2100_lab07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
    Class:  MainActivity
    Author: Jinpei Chen
    Date:   01/05/2019
**/
public class MainActivity extends AppCompatActivity {

    // OnCreate generates content in the main activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(listener);
    }

    // OnClick defines the incident when click the button1
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // text set to empty when click button
            EditText editText = findViewById(R.id.editText1);
            editText.setText("");
        }
    };
}
