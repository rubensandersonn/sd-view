package com.example.rubens.myapplication;

import java.util.ArrayList;

public class ActuatorManager {
    ArrayList <Actuator> acts = new ArrayList<Actuator>();

    public void setActs(ArrayList<Actuator> acts) {
        this.acts = acts;
    }

    public ArrayList<Actuator> getList(){
        return acts;
    }

    public ActuatorManager(){}

}
