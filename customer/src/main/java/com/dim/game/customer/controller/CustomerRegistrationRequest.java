package com.dim.game.customer.controller;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
