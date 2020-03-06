package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Component
@Data
@Entity
public class Transaction {

    @Id
    private String transactionId;
    
    @Column
    private String consumer;

    @ElementCollection
    private Map<String, Integer> coconuts;
    
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
