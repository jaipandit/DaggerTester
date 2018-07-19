package jai.com.daggertester.di.modules;

import dagger.Module;
import dagger.Provides;
import jai.com.daggertester.di.scopes.ApplicationScope;
import jai.com.daggertester.models.ApplicationScopeClass;

@Module
public class ApplicationModule {

    @ApplicationScope
    @Provides
    ApplicationScopeClass getApplicationScopeClass(){
        return new ApplicationScopeClass();
    }
}
