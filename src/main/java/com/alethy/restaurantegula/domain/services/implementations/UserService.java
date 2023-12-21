package com.alethy.restaurantegula.domain.services.implementations;

import com.alethy.restaurantegula.domain.dtos.UserDTO;
import com.alethy.restaurantegula.domain.models.UserModel;
import com.alethy.restaurantegula.domain.repositories.IUserRepository;
import com.alethy.restaurantegula.domain.services.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel save(UserDTO dto) {
        UserModel userModel = new UserModel();

        BeanUtils.copyProperties(dto, userModel);

        return this.userRepository.save(userModel);
    }
}
