package com.dim.game.subscription.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubscriptionCheckHistory {
    @Id
    @SequenceGenerator(
            name = "subscription_id_sequence",
            sequenceName = "subscription_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subscription_id_sequence"
    )
    private int id;
    private int customerId;
    private boolean isSubscriber;
    private LocalDateTime createdAt;
}
