package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Data
@Entity
@Table(name="Coconut")
public class Coconut {

    @Id
    @Column(name = "type")
    private String type;

    @Column(name = "cost")
    private float cost;
}
