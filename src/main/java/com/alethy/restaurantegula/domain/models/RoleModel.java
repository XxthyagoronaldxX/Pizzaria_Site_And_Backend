package com.alethy.restaurantegula.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "role_tb")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class RoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private UUID id;

    @Column
    private String name;
}
