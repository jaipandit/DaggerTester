package jai.com.daggertester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import jai.com.daggertester.Activities.BaseActivity;
import jai.com.daggertester.Activities.GeneralSalesFlowScreen1;
import jai.com.daggertester.models.ApplicationScopeClass;
import jai.com.daggertester.models.PerActivityScopeClass;

public class MainActivity extends BaseActivity{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, GeneralSalesFlowScreen1.class));
    }

    @Override
    protected String getActivityName(){
        return MainActivity.class.getSimpleName();
    }
}
