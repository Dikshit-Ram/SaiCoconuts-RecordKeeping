package org.saicoconuts.records.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
public class Consumer {

    @Id
    private UUID consumerId;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name = "transactionId")
    private List<Transaction> transactions;

    @Column
    private Long debt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;

    public Consumer() {
        consumerId = UUID.randomUUID();
    }
}
