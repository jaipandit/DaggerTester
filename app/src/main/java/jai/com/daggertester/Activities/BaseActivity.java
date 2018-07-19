package jai.com.daggertester.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import jai.com.daggertester.R;
import jai.com.daggertester.di.Components.DaggerPerActivityComponent;
import jai.com.daggertester.di.Components.PerActivityComponent;

public abstract class BaseActivity extends AppCompatActivity {

    protected PerActivityComponent perActivityComponent;

    private TextView activityName;

    protected abstract String getActivityName();

    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);
        setContentView(R.layout.activity_main);
        activityName = findViewById(R.id.activity_name);
        activityName.setText(getActivityName());

        // Create the per activity component.
        perActivityComponent = DaggerPerActivityComponent.builder().build();

        perActivityComponent.getPerActivityScopeClass();
        perActivityComponent.getPerActivityScopeClass();
    }

}
