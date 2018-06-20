package jai.com.daggertester.Activities;

import android.os.Bundle;

import jai.com.daggertester.DaggerTesterApplication;

public class GeneralSalesFlowScreen1 extends BaseActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        (DaggerTesterApplication)getApplication()
    }
}
