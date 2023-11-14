package com.alethy.restaurantegula.domain.repositories;

import com.alethy.restaurantegula.domain.models.ItemOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IItemOrderRepository extends JpaRepository<ItemOrderModel, UUID> {
}
