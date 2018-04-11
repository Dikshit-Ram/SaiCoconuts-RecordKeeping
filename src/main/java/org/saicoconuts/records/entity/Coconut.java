package org.saicoconuts.records.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Coconut {

    @Id
    private String type;
    
    @Column
    private float cost;
}
