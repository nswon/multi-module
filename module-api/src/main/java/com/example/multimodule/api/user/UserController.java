package com.example.multimodule.api.user;

import com.example.multimodule.core.user.dto.CreateRequest;
import com.example.multimodule.core.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public void create(@RequestBody CreateRequest request) {
        userService.create(request);
    }
}