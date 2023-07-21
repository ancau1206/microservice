package com.vn.serviceinventory;

import com.vn.serviceinventory.model.Inventory;
import com.vn.serviceinventory.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceInventoryApplication.class, args);
    }

}
