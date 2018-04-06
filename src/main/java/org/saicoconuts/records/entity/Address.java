package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Component
@Data
@Entity
@Table(name = "Address")
public class Address {

    @Id
    private UUID addressId;

    @Column(name = "line1")
    private String line1;

    @Column(name = "line2")
    private String line2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private int zipcode;

    public Address() {
        addressId = UUID.randomUUID();
    }
}
