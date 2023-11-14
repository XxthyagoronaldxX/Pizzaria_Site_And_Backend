package com.alethy.restaurantegula.domain.repositories;

import com.alethy.restaurantegula.domain.models.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IOrderRepository extends JpaRepository<OrderModel, UUID> {
}
