package jai.com.daggertester.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import jai.com.daggertester.DaggerTesterApplication;
import jai.com.daggertester.R;
import jai.com.daggertester.di.Components.ApplicationComponent;
import jai.com.daggertester.di.Components.DaggerPerActivityComponent;
import jai.com.daggertester.di.Components.PerActivityComponent;
import jai.com.daggertester.di.scopes.ApplicationScope;
import jai.com.daggertester.models.ApplicationScopeClass;
import jai.com.daggertester.models.PerActivityScopeClass;

public abstract class BaseActivity extends AppCompatActivity {

    protected PerActivityComponent perActivityComponent;

    private TextView activityName;

    protected abstract String getActivityName();

    @Inject
    public ApplicationScopeClass applicationScopeClass;

    protected PerActivityScopeClass perActivityScopeClass;

    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);
        setContentView(R.layout.activity_main);
        activityName = findViewById(R.id.activity_name);
        activityName.setText(getActivityName());

        ApplicationComponent applicationComponent = ((DaggerTesterApplication) getApplication()).getApplicationComponent();
        applicationComponent.inject(this);


        // Create the per activity component.
        perActivityComponent = DaggerPerActivityComponent.builder().applicationComponent(applicationComponent).build();
        perActivityScopeClass = perActivityComponent.getPerActivityScopeClass();
    }

}
