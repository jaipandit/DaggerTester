package jai.com.daggertester;

import android.app.Application;

import jai.com.daggertester.di.Components.ApplicationComponent;
import jai.com.daggertester.di.Components.DaggerApplicationComponent;

public class DaggerTesterApplication extends Application{

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
