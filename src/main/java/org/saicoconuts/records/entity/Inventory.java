package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity
public class Inventory {

    @Id
    private String inventoryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item")
    private Item item;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type")
    private Type type;

    @Column
    private int quantity;
}
