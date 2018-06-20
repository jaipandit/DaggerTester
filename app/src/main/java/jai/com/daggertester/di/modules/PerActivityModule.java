package jai.com.daggertester.di.modules;

import dagger.Module;
import dagger.Provides;
import jai.com.daggertester.di.scopes.PerActivity;
import jai.com.daggertester.models.PerActivityScopeClass;

@Module
public class PerActivityModule {

    @Provides
    @PerActivity
    PerActivityScopeClass getPerActivityScopeClass(){
        return new PerActivityScopeClass();
    }
}
