package org.zvv.eurikaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurikaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurikaClientApplication.class, args);
    }

}
