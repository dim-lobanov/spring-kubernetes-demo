package com.dim.game.subscription.controller;

import com.dim.game.api.clients.subscription.SubscriptionCheckResponse;
import com.dim.game.subscription.service.SubscriptionCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/subscription-check")
@AllArgsConstructor
public final class SubscriptionController {
    private final SubscriptionCheckService subscriptionCheckService;

    @GetMapping("{customerId}")
    public SubscriptionCheckResponse isSubscriber(@PathVariable int customerId) {
        return new SubscriptionCheckResponse(subscriptionCheckService.isSubscriber(customerId));
    }
}
