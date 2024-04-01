package com.test.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication
public class TestingWebApplication {
    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(TestingWebApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void printServerUrl() {
        String port = environment.getProperty("server.port");
        String hostname = InetAddress.getLoopbackAddress().getHostName();
        System.out.println("Server URL: " + "http://" + hostname + ":" + port);
    }

}