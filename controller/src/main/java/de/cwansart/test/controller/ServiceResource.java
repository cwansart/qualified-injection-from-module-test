package de.cwansart.test.controller;

import de.cwansart.test.api.Service;
import de.cwansart.test.api.ServiceA;
import de.cwansart.test.api.ServiceB;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("service")
@Produces(MediaType.TEXT_PLAIN)
public class ServiceResource {

    @Inject
    @ServiceA
    private Service serviceA;

    @Inject
    @ServiceB
    private Service serviceB;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getServiceOverview() {
        return Response.ok("<a href=\"./service/a\">Service A</a><br><a href=\"./service/b\">Service B</a><br>").build();
    }

    @GET
    @Path("a")
    public Response getServiceA() {
        return Response.ok(serviceA.getServiceName()).build();
    }

    @GET
    @Path("b")
    public Response getServiceB() {
        return Response.ok(serviceB.getServiceName()).build();
    }
}
