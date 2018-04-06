package org.saicoconuts.records.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table
@Component
public class Consumer {

    @Id
    private UUID consumerId;

    @Column
    private String name;

    @Autowired
    @OneToMany
    private List<Transaction> transactions;

    @Column
    private Long debt;

    @Autowired
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Consumer() {
        consumerId = UUID.randomUUID();
    }
}
