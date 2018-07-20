package jai.com.daggertester.di.Components;

import dagger.Component;
import jai.com.daggertester.Activities.BaseActivity;
import jai.com.daggertester.di.modules.ApplicationModule;
import jai.com.daggertester.di.scopes.ApplicationScope;
import jai.com.daggertester.models.ApplicationScopeClass;

/**
 * Application Wide component.
 * <p>
 * 1. We always define the scope of the Component. i.e This is @Singleton i.e Objects given by this component should
 * be create once the application lifetime.
 * <p>
 * 2. We should try to define the modules of the component right away.
 * <p>
 * Three rules for Subcomponent Setup:
 * 1. A Subcomponent can have only one Parent.
 * 2. A Parent must provide getter method for its child subcomponents.
 * 3. A subcomponent has access to all of the parent objects.
 */
@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    // Getter for the child subcomponent.
    //GeneralSalesFlowComponent getGeneralSalesFlowComponent();

    //Context getAppContext();

    // Subgraph.
    ApplicationScopeClass getApplicationScopeClass();

    void inject(BaseActivity baseActivity);
}
