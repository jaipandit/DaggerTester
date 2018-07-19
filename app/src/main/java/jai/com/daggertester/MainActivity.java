package jai.com.daggertester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jai.com.daggertester.Activities.BaseActivity;
import jai.com.daggertester.Activities.GeneralSalesFlowScreen1;

public class MainActivity extends BaseActivity{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((DaggerTesterApplication) getApplication()).getApplicationComponent().getApplicationScopeClass();
        ((DaggerTesterApplication) getApplication()).getApplicationComponent().getApplicationScopeClass();

        startActivity(new Intent(this, GeneralSalesFlowScreen1.class));
    }

    @Override
    protected String getActivityName(){
        return MainActivity.class.getSimpleName();
    }
}
