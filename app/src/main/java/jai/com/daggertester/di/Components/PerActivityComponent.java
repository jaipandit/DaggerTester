package jai.com.daggertester.di.Components;

import dagger.Component;
import jai.com.daggertester.Activities.GeneralSalesFlowScreen1;
import jai.com.daggertester.MainActivity;
import jai.com.daggertester.di.modules.PerActivityModule;
import jai.com.daggertester.di.scopes.PerActivityScope;
import jai.com.daggertester.models.PerActivityScopeClass;

/**
 * Component for objects created per activity.
 */
@Component(dependencies = ApplicationComponent.class, modules = PerActivityModule.class)
@PerActivityScope
public interface PerActivityComponent {

    PerActivityScopeClass getPerActivityScopeClass();
}
