package com.alethy.restaurantegula.domain.services;

import com.alethy.restaurantegula.domain.dtos.UserDTO;
import com.alethy.restaurantegula.domain.models.UserModel;

public interface IUserService {
    UserModel save(UserDTO dto);
}
