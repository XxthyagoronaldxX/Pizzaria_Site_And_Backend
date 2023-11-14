package com.alethy.restaurantegula.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address_tb")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true)
    private UUID id;

    @Column
    private int houseNumber;

    @Column
    private String district;

    @Column
    private String complement;

    @OneToOne
    @JsonIgnore
    private ClientModel clientModel;
}
