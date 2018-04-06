package org.saicoconuts.records.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Component
@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    private UUID transactionId;

    public Transaction() {
        transactionId = UUID.randomUUID();
    }
}
