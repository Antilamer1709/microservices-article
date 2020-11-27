package com.antilamer.inventory;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(value = {
        "com.antilamer.inventory"
})
@EntityScan(basePackages = {
        "com.antilamer.inventory.domain"
})
@EnableJpaRepositories(basePackages = {
        "com.antilamer.inventory.repository"
})
public class InventoryDatabaseConfiguration {
}
