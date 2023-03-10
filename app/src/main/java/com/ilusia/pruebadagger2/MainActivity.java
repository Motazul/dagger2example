package com.ilusia.pruebadagger2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.ilusia.pruebadagger2.di.MotorAplication;
import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Named("gasolina")@Inject
    Motor motor;

    @Inject
    Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MotorAplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(MainActivity.this, motor.getTipoMotor(), Toast.LENGTH_SHORT).show();

        Toast.makeText(MainActivity.this, coche.getMotor(), Toast.LENGTH_SHORT).show();
    }

}