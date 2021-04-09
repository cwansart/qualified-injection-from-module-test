package de.cwansart.test.impl;

import de.cwansart.test.api.Service;
import de.cwansart.test.api.ServiceA;

@ServiceA
public class ServiceImplA implements Service {

    @Override
    public String getServiceName() {
        return "Service 2A";
    }
}
