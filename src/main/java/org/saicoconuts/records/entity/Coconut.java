package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Data
@Entity
public class Coconut {

    @Id
    private String type;
    
    @Column(nullable = false)
    private Float cost;

    @Column(nullable = false)
    private Long stock;
}
