package com.nissan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.entity.Status;

@Repository
public interface IStatusRepository extends CrudRepository<Status, Integer>{
	
}
