package com.vinnovate.takehometest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinnovate.takehometest.entity.Finance;
import com.vinnovate.takehometest.entity.FinanceInputDTO;
import com.vinnovate.takehometest.entity.FinanceOutputDTO;
import com.vinnovate.takehometest.repository.FinanceRepository;

@Service
public class FinanceServiceImpl {
	
	@Autowired
	private FinanceRepository financeRepository;
		
	public FinanceOutputDTO getTransactionDetails(FinanceInputDTO input ) {
		double sumOfTransaction = 0;
		int noOfTransaction = 0;
		FinanceOutputDTO output = new FinanceOutputDTO();
		List<Finance> resultFromDB = financeRepository.findAllByFromDateToDate(input.getFromDate(), input.getToDate(), input.getMerchant());
		for(Finance finance : resultFromDB) {
			sumOfTransaction+= finance.getAmount();
			noOfTransaction++;
		}
		
		double averageOfTransaction = sumOfTransaction / noOfTransaction;
		output.setAvgTransactionValue(averageOfTransaction);
		output.setNoOfTransactions(noOfTransaction);
		
		return output;
	}
}
