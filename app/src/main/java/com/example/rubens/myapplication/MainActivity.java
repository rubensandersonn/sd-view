package com.example.rubens.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList sensorList = new ArrayList <Object>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getAll (View view){
        System.out.println("cu gososo");
    }

    private void getSensors(){

    }
    private void getActuators(){

    }

    private void setActuatorState(String actuatorName, String value){

    }


}
