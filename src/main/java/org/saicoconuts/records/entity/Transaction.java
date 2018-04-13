package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Component
@Data
@Entity
public class Transaction {

    @Id
    private String transactionId;
    
    @ManyToOne
    private Consumer consumer;

    @ElementCollection
    private Map<String, Integer> coconuts;
    
    @Column(nullable = false)
    private Long sale;
    
    @Column(nullable = false)
    private Long paid;
    
    @Column(nullable = false)
    private Date transactionDate;

    @OneToMany
    private List<Payment> payments;
    
    @Column
    private String comment;
    
    public Transaction() {
        transactionId = UUID.randomUUID().toString();
    }
}
