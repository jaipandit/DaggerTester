package jai.com.daggertester.models;

import android.util.Log;

/**
 * A model class to be created per activity instance.
 */
public class PerActivityScopeClass {

    public PerActivityScopeClass() {
        Log.e(PerActivityScopeClass.class.getSimpleName(), "Per activity object created.");
    }
}
