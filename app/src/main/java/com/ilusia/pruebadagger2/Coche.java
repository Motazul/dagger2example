package com.ilusia.pruebadagger2;
import com.ilusia.pruebadagger2.Motor;

public class Coche {

    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public String getMotor(){
        return ("Coche con: " + this.motor.getTipoMotor());
    }
}
