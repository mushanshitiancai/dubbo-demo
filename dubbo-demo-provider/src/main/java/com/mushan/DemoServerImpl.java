package com.mushan;

/**
 * Created by mazhibin on 16/7/30
 */
public class DemoServerImpl implements DemoServer {
    public String sayHello(String name) {
        return "hello " + name + "!";
    }
}
