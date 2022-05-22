package com.vinnovate.takehometest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinnovate.takehometest.entity.Finance;
import com.vinnovate.takehometest.entity.FinanceInputDTO;
import com.vinnovate.takehometest.entity.FinanceOutputDTO;
import com.vinnovate.takehometest.repository.FinanceRepository;
import com.vinnovate.takehometest.service.FinanceServiceImpl;

@RestController
public class FinanceController {
	
	@Autowired
	private FinanceServiceImpl financeServiceImpl;
	
	@Autowired
	private FinanceRepository financeRepository;
	
	/*
	 * Post Method is used to take input from the user and it will return the expected output from DB.
	 */
	
	@PostMapping("/transaction")
	public FinanceOutputDTO getProcessedTransaction(@RequestBody FinanceInputDTO input) throws Exception {
		
		return financeServiceImpl.getTransactionDetails(input);
		
	}
	
	/*
	 * Get Method is used to get the details of all the transaction available on DB.	
	 */
	@GetMapping("/getTransactions")
	public List<Finance> getAllTransaction(){
		
		return financeRepository.findAll();
		
	}
}
