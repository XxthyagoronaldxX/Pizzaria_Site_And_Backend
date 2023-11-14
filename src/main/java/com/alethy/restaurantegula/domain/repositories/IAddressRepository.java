package com.alethy.restaurantegula.domain.repositories;

import com.alethy.restaurantegula.domain.models.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IAddressRepository extends JpaRepository<AddressModel, UUID> {
}
