package com.example.webdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Furniture {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;
	    
	    private String colour;
	    
	    private int height;
	    private int width;
	    
	    
	    
		public Furniture(String name, String colour, int height, int width) {
			super();
			this.name = name;
			this.colour = colour;
			this.height = height;
			this.width = width;
		}



		public Furniture() {
			super();
		}



		public Furniture(Long id, String name, String colour, int height, int width) {
			super();
			this.id = id;
			this.name = name;
			this.colour = colour;
			this.height = height;
			this.width = width;
		}
	    
	    
}
