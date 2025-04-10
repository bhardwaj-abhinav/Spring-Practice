package com.abhi.it.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Account {

	private String accountName;
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPK;
	
}
