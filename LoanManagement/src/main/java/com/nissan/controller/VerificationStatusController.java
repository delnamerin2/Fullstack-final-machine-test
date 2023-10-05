package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.entity.VerificationStatus;
import com.nissan.service.VerificationStatusService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VerificationStatusController {
	
	@Autowired
	private VerificationStatusService verificationStatusService;

	//listing all status
		@GetMapping("/getverificationstatus")
		public List<VerificationStatus>getAllStatus(){
			return verificationStatusService.getAllVerificationStatus();
		}
}
