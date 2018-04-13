package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Component
@Data
@Entity
public class Address {

    @Id
    private String addressId;

    @Column(nullable = false)
    private String line1;

    @Column
    private String line2;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private Integer zipcode;

    public Address() {
        addressId = UUID.randomUUID().toString();
    }
}
