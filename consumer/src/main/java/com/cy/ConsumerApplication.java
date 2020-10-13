package com.cy;

import com.cy.dubbo.UserDubboConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        UserDubboConsumerService consumerService = run.getBean(UserDubboConsumerService.class);
        consumerService.printUser();
    }

}
