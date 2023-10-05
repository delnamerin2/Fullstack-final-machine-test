package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.entity.Status;
import com.nissan.repository.IStatusRepository;
@Service
public class StatusService implements IStatusService{

	@Autowired
	private IStatusRepository statusRepo;
	@Override
	public List<Status> getAllStatus() {
		// TODO Auto-generated method stub
				return (List<Status>) statusRepo.findAll();
	}

}
