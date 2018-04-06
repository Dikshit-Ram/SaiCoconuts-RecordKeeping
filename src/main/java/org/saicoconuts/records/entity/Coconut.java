package org.saicoconuts.records.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class Coconut {

	public enum Type{ 
		QUALITY("Quality"), NEW("New"), MEDIUM("Medium"), OTHER("Other");
		
		private String type;
		Type(String type) {
			this.type = type;
		}
		};
		
    @Id
    @Enumerated(EnumType.STRING)
    private Type type;
    

    @Column
    private float cost;
}
