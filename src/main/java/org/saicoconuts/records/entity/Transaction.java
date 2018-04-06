package org.saicoconuts.records.entity;

import java.util.Map;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class Transaction {

    @Id
    private UUID transactionId;
    
    @MapKeyEnumerated(EnumType.STRING)
    @ElementCollection
    private Map<Coconut.Type, Integer> coconutQuantites;
    
    @Column
    private Long sale;
    
    @Column
    private Long paid;
    
    public Transaction() {
        transactionId = UUID.randomUUID();
    }
}
