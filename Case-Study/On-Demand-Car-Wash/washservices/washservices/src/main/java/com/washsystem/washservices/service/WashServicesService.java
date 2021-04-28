package com.washsystem.washservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.washsystem.washservices.model.AddOn;
import com.washsystem.washservices.model.WashServices;
import com.washsystem.washservices.repository.WashServicesRepository;

@Service
public class WashServicesService {
	
	@Autowired
	WashServicesRepository washRepo;
	

	//View All Service
		public List<WashServices> findAllWashServices() throws Exception
		{
			List<WashServices> washServicesList = washRepo.findAll();
			if(washServicesList.isEmpty())
				throw new Exception();
			return washServicesList;
		}
		
		public Optional<WashServices> findWashService(String washServicesName) throws IllegalArgumentException,Exception
		{
			Optional<WashServices> washServices = washRepo.findById(washServicesName);
			if(washServices.isEmpty()) {
				throw new Exception();
			}
			return washServices;	
		}
		
		//Add Service
		public void addWashServices(WashServices washServices) throws Exception
		{
			washServices.setStatus(true);
			washRepo.save(washServices);
		}
		
		//Delete Service
		public void deleteWashServices(String washServicesName) throws IllegalArgumentException,Exception {
			Optional<WashServices> washServices = washRepo.findById(washServicesName);
			if(washServices.isEmpty()) {
				throw new Exception();
			}
			washRepo.deleteById(washServicesName);
		}
		
		public ResponseEntity<?> changeStatus(String name) throws Exception{
			WashServices washServices = washRepo.findById(name).orElseThrow(()-> new Exception());
			if(washServices.getStatus())
				washServices.setStatus(false);
			else
				washServices.setStatus(true);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	
}
