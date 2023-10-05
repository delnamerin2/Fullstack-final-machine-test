package com.nissan.repository;

import org.springframework.data.repository.CrudRepository;

import com.nissan.entity.LoanType;

public interface ILoanTypeRepository extends CrudRepository<LoanType, Integer>{

}
