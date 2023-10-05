package com.nissan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.entity.VerificationStatus;

@Repository
public interface IVerificationStatusRepository extends CrudRepository<VerificationStatus, Integer> {
	
}
