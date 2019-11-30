package com.example.webdemo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.webdemo.model.Furniture;
import com.example.webdemo.service.FurnitureService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value = "furniture")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class FurnitureController {
	private final FurnitureService fs;
	
	@GetMapping("{id}")
	public ResponseEntity<Furniture> getFurnitureById(@PathVariable Long id){
		return ResponseEntity.ok(fs.getFurnitureById(id));
	}
	
	@GetMapping
	public ModelAndView showFurnitureList() {
		ModelAndView mav = JSPController.mav;
		mav.setViewName("furniturelist");
		mav.addObject("furniturelist", fs.getAllFurniture());
		
		
		return mav;
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public @ResponseBody ResponseEntity<Furniture> createFurniture(@RequestParam("name") String name,
			@RequestParam("colour") String colour,
			@RequestParam("height") int height,
			@RequestParam("width") int width){
		Furniture saved = fs.createFurniture(new Furniture(name, colour, height, width));
		
		return ResponseEntity.created(URI.create("" + saved.getId())).body(saved);
	}
	
	@PostMapping(value = "/displaydetails" ,consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public @ResponseBody ModelAndView displayDetails(@RequestParam("id") long id){
		Furniture selected = fs.getFurnitureById(id);
		ModelAndView mav = JSPController.mav;
		mav.setViewName("furnituredetails");
		mav.addObject("chosenf", selected);
		
		return mav;
	}
}
