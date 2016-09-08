

/*
        Name : Sagar Sudhakar
        Course : CSCI 522 Andoird Programming
        Instuctor: Jorja Brown
        Assignment 1 ----> Portfolio 1(HelloApp + TapCounterApp)
        Date : 4th September 2016


*/



package edu.niu.z1783546.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHello;
    Button exclamBtn;
    Boolean isHello;

    //to indicate if hello is currently displayed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //establish references to button and textview
        tvHello = (TextView) findViewById(R.id.textViewHello);
        exclamBtn = (Button) findViewById(R.id.btnExclamstr);
        initializeGreeting();
        exclamBtn.setOnClickListener(toggleGreeting);
    }

    private final View.OnClickListener toggleGreeting = new View.OnClickListener() {
        @Override
        public void
        onClick(View v) {
//to toggle the greeting when the button is clicked
            if (isHello)
            {
                isHello = false;
                tvHello.setText(R.string.goodbye);
            } else
            {
                isHello = true;
                tvHello.setText(R.string.hello);
            }
        }
    };

    private void initializeGreeting() {
        isHello = true;
    }
}


