package com.example.userservice.Proxy;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.userservice.Model.TransactionDto;

@FeignClient("Admin-Service/Admin")
public interface AdminProxy {
	/*@PostMapping("/applyloan") 
	public Loan InsertLoan(@RequestBody Loan loan);
	

	@PostMapping("/doTransaction")
	public Transaction doTransaction(@RequestBody Transaction transaction);
	
	}*/

	@GetMapping("/findAccountByNumberAndDate/{account_number}/{date_of_transaction}")
	public Optional<TransactionDto> findAccountByNumberAndDate(@PathVariable("account_number") String account_number,
			@PathVariable("date_of_transaction") Date date_of_transaction);
	

	@GetMapping("/findByAccountNumber/{account_number}")
	public List<TransactionDto> findByAccountNumber(@PathVariable("account_number") String account_number);
	

}
