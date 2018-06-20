package jai.com.daggertester.models;

import android.content.Context;
import android.util.Log;

/**
 * The model class whose object should be create once every GeneralSalesFlow.
 */
public class GeneralSalesFlowClass {

    private Context appContext;

    public GeneralSalesFlowClass(Context appContext) {
        this.appContext = appContext;
        Log.i(GeneralSalesFlowClass.class.getSimpleName(), "GeneralSalesFlowClass Constructor called.");
    }
}
