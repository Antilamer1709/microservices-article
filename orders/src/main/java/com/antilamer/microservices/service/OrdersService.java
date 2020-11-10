package com.antilamer.microservices.service;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrdersService {

    @Autowired
    private RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient discoveryClient;


    public String createOrder(Integer productId) {
        Boolean productAvailable = isProductAvailable(productId);
        if (!productAvailable) {
            return "Product with id " + productId + " is not available";
        }
        return "Order of product with id " + productId + " has been created!";
    }

    private Boolean isProductAvailable(Integer productId) {
        String url = discoveryClient.getNextServerFromEureka("inventory", false).getHomePageUrl();
        String firstClientResponse = restTemplate.getForEntity(url + "/api/inventory/" + productId, String.class).getBody();

        if (firstClientResponse != null) {
            return firstClientResponse.equals("true");
        } else {
            return false;
        }
    }

}
