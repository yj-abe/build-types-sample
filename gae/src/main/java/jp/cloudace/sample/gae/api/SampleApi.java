package jp.cloudace.sample.gae.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import jp.cloudace.sample.gae.BuildConfig;

@Api(name = "sample", version = "v1")
public class SampleApi {

    @ApiMethod(
            name = "info.get",
            path = "info",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public Info info() {
        Info info = new Info();
        info.setDebuggable(BuildConfig.DEBUG);
        info.setEnvironment(BuildConfig.ENV_NAME);
        return info;
    }

}
