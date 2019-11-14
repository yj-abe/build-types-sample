package jp.cloudace.sample.gae;

import com.google.api.server.spi.guice.EndpointsModule;
import com.google.common.collect.ImmutableList;

import jp.cloudace.sample.gae.api.SampleApi;

public class DependencyModule extends EndpointsModule {

    @Override
    protected void configureServlets() {
        super.configureServlets();
        configureEndpoints("/api/*", ImmutableList.of(
                SampleApi.class
        ));
    }
}
