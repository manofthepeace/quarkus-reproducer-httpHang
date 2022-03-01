package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "api")
public interface ReactiveClient {

    @GET
    @Path("/hello")
    public String testApi();

}
