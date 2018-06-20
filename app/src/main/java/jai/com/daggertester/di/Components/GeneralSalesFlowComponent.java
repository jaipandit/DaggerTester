package jai.com.daggertester.di.Components;

import dagger.Subcomponent;
import jai.com.daggertester.di.modules.GeneralSalesFlowModule;
import jai.com.daggertester.di.scopes.GeneralSalesFlowScope;

/**
 * The Component for General Sales flow.
 */
@GeneralSalesFlowScope
@Subcomponent(modules = GeneralSalesFlowModule.class)
public interface GeneralSalesFlowComponent {
}
