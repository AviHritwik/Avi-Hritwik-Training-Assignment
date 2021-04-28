package com.washsystem.washservices.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.washsystem.washservices.model.AddOn;
import com.washsystem.washservices.repository.AddOnRepository;

@Service
public class AddOnServices {
	
	@Autowired
	AddOnRepository addOnRepo;
	
	//View All Service
	public List<AddOn> findAllAddOn() throws Exception
	{
		List<AddOn> addOnList = addOnRepo.findAll();
		if(addOnList.isEmpty())
			throw new Exception();
		return addOnList;
	}
	
	public Optional<AddOn> findAddOn(String addOnName) throws IllegalArgumentException,Exception
	{
		Optional<AddOn> addOn = addOnRepo.findById(addOnName);
		if(addOn.isEmpty()) {
			throw new Exception();
		}
		return addOn;	
	}
	
	//Add Service
	public void addAddOn(AddOn addOn) throws Exception
	{
		addOn.setStatus(true);
		addOnRepo.save(addOn);
	}
	
	//Delete Service
	public void deleteAddOn(String addOnName) throws IllegalArgumentException,Exception {
		Optional<AddOn> addOn = addOnRepo.findById(addOnName);
		if(addOn.isEmpty()) {
			throw new Exception();
		}
		addOnRepo.deleteById(addOnName);
	}
	
	public ResponseEntity<?> changeStatus(String name) throws Exception{
		AddOn addOn = addOnRepo.findById(name).orElseThrow(()-> new Exception());
		if(addOn.getStatus())
			addOn.setStatus(false);
		else
			addOn.setStatus(true);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/*
	//Update Service
	public String updateOrderStatus(String addOnName, AddOn addOnArg) {
		String name=addOnArg.getAddOnName();
		String description = addOnArg.getAddOnDescription();
		double cost = addOnArg.getCost();
		
		addOnRepo.findById(addOnName).map((addOn) -> {
			
		})
	}*/
	
}
