package com.example.multimodule.core.user.dto;

import com.example.multimodule.core.user.domain.User;

public record CreateRequest(String email) {
    public User toEntity() {
        return User.create(email);
    }
}