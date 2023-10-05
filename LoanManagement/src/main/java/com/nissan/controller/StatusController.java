package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.entity.Status;
import com.nissan.service.StatusService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	//listing all status
	@GetMapping("/getstatus")
	public List<Status>getAllStatus(){
		return statusService.getAllStatus();
	}
}
