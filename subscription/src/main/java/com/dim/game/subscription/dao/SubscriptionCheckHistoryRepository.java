package com.dim.game.subscription.dao;

import com.dim.game.subscription.entity.SubscriptionCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionCheckHistoryRepository extends JpaRepository<SubscriptionCheckHistory, Integer> {
}
