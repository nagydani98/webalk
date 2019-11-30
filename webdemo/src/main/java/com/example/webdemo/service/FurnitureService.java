package com.example.webdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdemo.model.Furniture;
import com.example.webdemo.persist.FurnitureRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class FurnitureService {
	private final FurnitureRepo furnitureRepo;
	
	public Furniture getFurnitureById(Long id) {
		return furnitureRepo.findById(id).orElse(new Furniture());
	}
	
	public List<Furniture> getAllFurniture(){
		return furnitureRepo.findAll();
	}
	
	public Furniture createFurniture(Furniture furniture) {
		return furnitureRepo.saveAndFlush(furniture);
	}
}
