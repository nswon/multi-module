package com.example.multimodule.core.user.service;

import com.example.multimodule.core.user.domain.UserRepository;
import com.example.multimodule.core.user.dto.CreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void create(CreateRequest request) {
        userRepository.save(request.toEntity());
    }
}