package com.dim.game.subscription.service;

import com.dim.game.subscription.entity.SubscriptionCheckHistory;
import com.dim.game.subscription.dao.SubscriptionCheckHistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record SubscriptionCheckService(SubscriptionCheckHistoryRepository subscriptionCheckHistoryRepository) {

    public boolean isSubscriber(Integer customerId) {
        subscriptionCheckHistoryRepository.save(
                SubscriptionCheckHistory.builder()
                        .customerId(customerId)
                        .isSubscriber(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
