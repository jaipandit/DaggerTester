package jai.com.daggertester.models;

import android.util.Log;

import javax.inject.Inject;

import jai.com.daggertester.di.scopes.ApplicationScope;

/**
 * Sample Model for Application Scope.
 */
@ApplicationScope
public class ApplicationScopeClass {

    @Inject
    public ApplicationScopeClass() {
        Log.e(ApplicationScopeClass.class.getSimpleName(), "Constructor called");
    }
}
