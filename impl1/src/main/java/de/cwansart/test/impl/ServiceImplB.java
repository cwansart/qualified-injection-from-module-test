package de.cwansart.test.impl;

import de.cwansart.test.api.Service;
import de.cwansart.test.api.ServiceB;

@ServiceB
public class ServiceImplB implements Service {

    @Override
    public String getServiceName() {
        return "Service 1B";
    }
}
