package org.saicoconuts.records.entity;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import lombok.Data;

import java.util.List;

@Data
@Entity
@Component
public class Item {

    @Id
    private String itemId;

    @Column
    private String item;

    @ManyToOne
    @JoinColumn(name = "type")
    private Type type;

    @Column
    private float cost;
}
