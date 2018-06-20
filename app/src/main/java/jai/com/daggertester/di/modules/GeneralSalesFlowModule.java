package jai.com.daggertester.di.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import jai.com.daggertester.di.scopes.GeneralSalesFlowScope;
import jai.com.daggertester.models.GeneralSalesFlowClass;

/**
 * The Module for {@link jai.com.daggertester.di.Components.GeneralSalesFlowComponent}
 */
@Module
public class GeneralSalesFlowModule {

    @Provides
    @GeneralSalesFlowScope
    GeneralSalesFlowClass generalSalesFlowClass(Context context) {
        return new GeneralSalesFlowClass(context);
    }
}
