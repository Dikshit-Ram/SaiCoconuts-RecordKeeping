package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Data
@Table(name = "Inventory")
public class Inventory {

    @Id
    @Column(name = "coconut")
    private Coconut coconut;

    @Column(name = "quantity")
    private int quantity;
}
