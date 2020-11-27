package com.antilamer.orders;

import com.antilamer.inventory.InventoryDatabaseConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {
        "com.antilamer.orders.domain"
})
@EnableJpaRepositories(
        basePackages = {"com.antilamer.orders.repository"}
)
@Import({
        InventoryDatabaseConfiguration.class
})
public class OrdersApplicationConfiguration {
}
