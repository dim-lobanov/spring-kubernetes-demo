package com.dim.game.api.clients.subscription;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "subscription", url = "${api.subscription.url}")
public interface SubscriptionFeignClient {

    @GetMapping(path = "api/v1/subscription-check/{customerId}")
    SubscriptionCheckResponse isSubscriber(@PathVariable("customerId") int customerId);

}
