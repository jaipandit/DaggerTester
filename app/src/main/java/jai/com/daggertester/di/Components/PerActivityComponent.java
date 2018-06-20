package jai.com.daggertester.di.Components;

import dagger.Component;
import jai.com.daggertester.di.modules.PerActivityModule;
import jai.com.daggertester.di.scopes.PerActivity;
import jai.com.daggertester.models.PerActivityScopeClass;

/**
 * Component for objects created per activity.
 */
@Component(modules = PerActivityModule.class)
@PerActivity
public interface PerActivityComponent {

    PerActivityScopeClass getPerActivityScopeClass();
}
