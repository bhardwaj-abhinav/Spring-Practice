package com.abhi.it;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.entity.Account;
import com.abhi.it.entity.AccountPK;
import com.abhi.it.repo.AccountRepo;

@SpringBootApplication
public class CompositePromaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CompositePromaryKeyApplication.class, args);
		AccountRepo accountRepo = context.getBean(AccountRepo.class);
		
		AccountPK apk = new AccountPK();
		apk.setAccountNumber(123456789L);
		apk.setAccountType("savings");
		
		Account account = new Account();
		account.setAccountName("Abhinav");
		account.setBranch("Najafgarh");
		account.setAccountPK(apk);
		
		accountRepo.save(account);
		
		Optional<Account> acc = accountRepo.findById(apk);
		if(acc.isPresent()) {
			System.out.println(acc.get());
		}
	}

}
