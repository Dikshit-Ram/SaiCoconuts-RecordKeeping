package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Component
public class Consumer {

    @Id
    private String consumerId;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "consumer")
    private List<Transaction> transactions;

    @Column
    private Long debt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;

    public Consumer() {
        consumerId = UUID.randomUUID().toString();
    }
}
