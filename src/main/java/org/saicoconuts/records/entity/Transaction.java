package org.saicoconuts.records.entity;

import java.sql.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Transaction {

    @Id
    private UUID transactionId;
    
    @ManyToOne
    private Consumer consumer;

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
        transactionId = UUID.randomUUID();
    }
}
