package com.example.webdemo.persist;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webdemo.model.Furniture;

@Repository
public interface FurnitureRepo extends JpaRepository<Furniture, Long>{
	Optional<Furniture> findById(Long id);
	
	Furniture findByName(String name);
}
