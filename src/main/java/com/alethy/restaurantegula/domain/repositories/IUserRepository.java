package com.alethy.restaurantegula.domain.repositories;

import com.alethy.restaurantegula.domain.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    Optional<UserModel> findByEmail(String email);
}
