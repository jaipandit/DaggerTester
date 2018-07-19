package jai.com.daggertester.Activities;

import android.os.Bundle;

import jai.com.daggertester.DaggerTesterApplication;
import jai.com.daggertester.MainActivity;

public class GeneralSalesFlowScreen1 extends BaseActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        //(DaggerTesterApplication)getApplication();
    }

    @Override
    protected String getActivityName(){
        return GeneralSalesFlowScreen1.class.getSimpleName();
    }
}
