package com.samlab.PlayFlix.Register.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samlab.PlayFlix.Register.model.Register;
import com.samlab.PlayFlix.Register.repo.RegisterRepository;


@RestController
public class RegisterController {




@Autowired RegisterRepository registerRepository;
	@PostMapping("/registerSave")
	
	public String insertRegister(@RequestBody Register reg) {
		registerRepository.save(reg);
		return "your record is saved..";
		
	}
	@GetMapping("/users")
	public List<Register> getRegister(){
		return (List<Register>) registerRepository.findAll();
		}
	
	
		}