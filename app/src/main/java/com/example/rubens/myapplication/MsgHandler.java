package com.example.rubens.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;


import java.util.ArrayList;

public class MsgHandler extends ListActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> sensorItems=new ArrayList<String>();
    ArrayList<String> actuatorItems=new ArrayList<String>();

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapterSensors;
    ArrayAdapter<String> adapterActuators;

    //RECORDING HOW MANY TIMES THE BUTTON HAS BEEN CLICKED
    int clickCounter=0;

    private void setNewItemSensor(Sensor s){
        String sensor;
        sensor = s.getIp() + "," + s.getData() + "," + s.getStatus();
        sensorItems.add(sensor);
        adapterSensors.notifyDataSetChanged();
    }

    private void setNewItemActuator(Actuator s){
        String sensor;
        sensor = s.getIp() + "," + s.getData() + "," + s.getStatus();
        actuatorItems.add(sensor);
        adapterActuators.notifyDataSetChanged();
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        // adapter sensors
        adapterSensors=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                sensorItems);
        setListAdapter(adapterSensors);

        // adapter actuators
        adapterActuators=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                actuatorItems);
        setListAdapter(adapterActuators);
    }

    public void dispatch(String msgFromServer){

    }
}
