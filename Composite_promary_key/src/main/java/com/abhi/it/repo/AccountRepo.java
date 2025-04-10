package com.abhi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.it.entity.Account;
import com.abhi.it.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK>{

}
