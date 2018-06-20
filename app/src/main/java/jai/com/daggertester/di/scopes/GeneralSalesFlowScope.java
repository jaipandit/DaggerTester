package jai.com.daggertester.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * To Annotate the object which should live across all the activities in the general ticket sales flow.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface GeneralSalesFlowScope {
}
