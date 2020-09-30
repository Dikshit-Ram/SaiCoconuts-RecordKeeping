package org.saicoconuts.records.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Component
public class Type {

    @Id
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private List<Item> items;
}
