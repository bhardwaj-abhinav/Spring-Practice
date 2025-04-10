package com.abhi.it.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK {

	private Long accountNumber;
	private String accountType;
}
