package jai.com.daggertester.Activities;

import android.os.Bundle;

import javax.inject.Inject;

import jai.com.daggertester.DaggerTesterApplication;
import jai.com.daggertester.MainActivity;
import jai.com.daggertester.models.ApplicationScopeClass;
import jai.com.daggertester.models.PerActivityScopeClass;

public class GeneralSalesFlowScreen1 extends BaseActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    protected String getActivityName(){
        return GeneralSalesFlowScreen1.class.getSimpleName();
    }
}
