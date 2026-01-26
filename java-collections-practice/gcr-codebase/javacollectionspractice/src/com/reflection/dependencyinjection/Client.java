package com.reflection.dependencyinjection;

public class Client {
    @Inject
    private Service service;

    public void run() {
        service.process();
    }
}

