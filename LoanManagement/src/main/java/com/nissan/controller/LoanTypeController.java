package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.entity.LoanType;
import com.nissan.service.LoanTypeService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanTypeController {
	@Autowired
	private LoanTypeService loanTypeService;
	
	@GetMapping("/getloantypes")
	public List<LoanType> getLoanTypes(){
		return loanTypeService.getAllLoanTypes();
	}
}
