package com.thebigscale.eurekaservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServiceApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
