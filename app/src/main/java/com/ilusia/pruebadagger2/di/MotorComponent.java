package com.ilusia.pruebadagger2.di;
import com.ilusia.pruebadagger2.MainActivity;
import dagger.Component;
import javax.inject.Singleton;

@PerActivity
@Singleton
@Component(modules={MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
