package com.dim.game.customer.service;

import com.dim.game.api.clients.subscription.SubscriptionCheckResponse;
import com.dim.game.api.clients.subscription.SubscriptionFeignClient;
import com.dim.game.customer.entity.Customer;
import com.dim.game.customer.controller.CustomerRegistrationRequest;
import com.dim.game.customer.dao.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public final class CustomerService {

    private final CustomerRepository customerRepository;
    private final SubscriptionFeignClient subscriptionClient;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer newCustomer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo check if email valid and not taken
        customerRepository.saveAndFlush(newCustomer);
        SubscriptionCheckResponse subscriptionCheckResponse = subscriptionClient.isSubscriber(newCustomer.getId());
        if (subscriptionCheckResponse.isSubscriber()) {
            log.info("Subscriber");
        }
    }
}
