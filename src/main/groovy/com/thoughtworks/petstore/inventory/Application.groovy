package com.thoughtworks.petstore.inventory

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@CompileStatic
@SpringBootApplication
@EnableDiscoveryClient
class Application {
    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}
