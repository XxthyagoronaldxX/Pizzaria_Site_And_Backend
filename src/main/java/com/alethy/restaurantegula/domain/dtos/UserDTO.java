package com.alethy.restaurantegula.domain.dtos;

import com.alethy.restaurantegula.domain.models.RoleModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class UserDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotNull
    private List<String> roles;
}
