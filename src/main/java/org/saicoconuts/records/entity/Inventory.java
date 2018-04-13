package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Data
@Entity
public class Inventory {

    @Id
    private String coconutType;

    @Column
    private int quantity;
}
