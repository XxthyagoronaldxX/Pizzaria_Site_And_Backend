package com.alethy.restaurantegula.domain.repositories;

import com.alethy.restaurantegula.domain.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IItemRepository extends JpaRepository<ItemModel, UUID> {
}
