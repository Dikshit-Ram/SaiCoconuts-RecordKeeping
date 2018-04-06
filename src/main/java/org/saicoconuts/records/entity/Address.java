package org.saicoconuts.records.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class Address {

    @Id
    private UUID addressId;

    @Column
    private String line1;

    @Column
    private String line2;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private int zipcode;

    public Address() {
        addressId = UUID.randomUUID();
    }
}
