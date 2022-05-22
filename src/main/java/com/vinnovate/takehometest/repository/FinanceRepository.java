package com.vinnovate.takehometest.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.vinnovate.takehometest.entity.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Id>{
	@Query(value = "Select * from finance where merchant = :merchant and date>= :fromDate and date<= :toDate" , nativeQuery = true)
	List<Finance> findAllByFromDateToDate(String fromDate, String toDate, String merchant);
}
