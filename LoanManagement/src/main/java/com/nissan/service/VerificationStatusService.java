package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.entity.VerificationStatus;
import com.nissan.repository.IVerificationStatusRepository;
@Service
public class VerificationStatusService implements IVerificationStatusService{

	@Autowired
	private IVerificationStatusRepository verificationStatusRepo;
	@Override
	public List<VerificationStatus> getAllVerificationStatus() {
			return (List<VerificationStatus>) verificationStatusRepo.findAll();
		}
	}

