package com.ilusia.pruebadagger2.di;

import com.ilusia.pruebadagger2.Coche;
import com.ilusia.pruebadagger2.Motor;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;


@Module
public class MotorModule {

    @Singleton
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor ("diesel");

    }
    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor ("gasolina");

    }

    @Provides
    public Coche providesCoche(@Named("diesel")Motor motor){
        return new Coche(motor);
    }
}



