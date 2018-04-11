package org.saicoconuts.records.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Payment
{

	@Id
	private Date date;
	
	@Column
	private Long payment;
}
