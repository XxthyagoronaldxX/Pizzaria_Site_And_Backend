package com.alethy.restaurantegula.api.controllers;

import com.alethy.restaurantegula.domain.dtos.UserDTO;
import com.alethy.restaurantegula.domain.services.IUserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userDTO));
    }

    @GetMapping
    public ResponseEntity<?> findAllEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAllEmployees());
    }
}
