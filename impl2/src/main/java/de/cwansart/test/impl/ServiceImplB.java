package de.cwansart.test.impl;

import de.cwansart.test.api.Service;
import de.cwansart.test.api.ServiceB;

@ServiceB
public class ServiceImplB implements Service {

    @Override
    public String getServiceName() {
        return "Service Impl2 B";
    }
}
