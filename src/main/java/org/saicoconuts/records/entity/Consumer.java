package org.saicoconuts.records.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "consumer")
@Component
public class Consumer {

    @Id
    private UUID consumerId;

    @Column(name = "name")
    private String name;

    @Autowired
    @OneToMany
    private List<Transaction> transactions;

    @Column(name = "debt")
    private Long debt;

    @Autowired
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Consumer() {
        consumerId = UUID.randomUUID();
    }
}
