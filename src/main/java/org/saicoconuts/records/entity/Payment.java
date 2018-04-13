package org.saicoconuts.records.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Payment
{

	@Id
	private Date date;
	
	@Column(nullable = false)
	private Long payment;
}
