package com.antilamer.orders;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {
        "com.antilamer.inventory"
})
public class OrdersApplicationConfiguration {
}
