package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Component
@Data
@Entity
public class Transaction {

    @Id
    private String transactionId;

    @ManyToOne
    @JoinColumn(name = "consumerId")
    private Consumer consumer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item")
    private Item item;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type")
    private Type type;
    
    @Column
    private Long sale;
    
    @Column
    private Long paid;
    
    @Column
    private Date transactionDate;
    
    @Column
    private String comment;
    
    public Transaction() {
        transactionId = UUID.randomUUID().toString();
    }
}
