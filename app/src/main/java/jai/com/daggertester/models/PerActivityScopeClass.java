package jai.com.daggertester.models;

import android.util.Log;

import javax.inject.Inject;

import jai.com.daggertester.di.scopes.PerActivityScope;

/**
 * A model class to be created per activity instance.
 */
@PerActivityScope
public class PerActivityScopeClass {

    private ApplicationScopeClass applicationScopeClass;

    @Inject
    public PerActivityScopeClass(ApplicationScopeClass applicationScopeClass) {
        Log.e(PerActivityScopeClass.class.getSimpleName(), "Per activity object created.");
        this.applicationScopeClass = applicationScopeClass;
    }
}
